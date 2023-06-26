package com.example.recylerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import androidx.appcompat.widget.SearchView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewkotlin.Data.Lyrics
import com.example.recylerviewkotlin.UI.MyAdapter
import java.util.*
import kotlin.collections.ArrayList

import com.example.recylerviewkotlin.Data.MyDataLayer

class MainActivity : AppCompatActivity() {
    //
    private val MyDL : MyDataLayer = MyDataLayer()

    //
    private lateinit var newRecylerview : RecyclerView
    //
    private lateinit var newArrayList : ArrayList<Lyrics>
    //
    private lateinit var tempArrayList : ArrayList<Lyrics>

    // Основна
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // змінна для recyclerView
        newRecylerview = findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)


        newArrayList = arrayListOf<Lyrics>()
        tempArrayList = arrayListOf<Lyrics>()
        getUserdata()

    }
    //
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_item,menu)
        val item = menu?.findItem(R.id.search_action)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
            }
            // QueryTextChange = Зміна тексту запиту
            override fun onQueryTextChange(newText: String?): Boolean {

                tempArrayList.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if (searchText.isNotEmpty()){

                    newArrayList.forEach {

                        if (it.heading.toLowerCase(Locale.getDefault()).contains(searchText)){


                            tempArrayList.add(it)

                        }

                    }

                    newRecylerview.adapter!!.notifyDataSetChanged()

                }else{

                    tempArrayList.clear()
                    tempArrayList.addAll(newArrayList)
                    newRecylerview.adapter!!.notifyDataSetChanged()

                }


                return false

            }


        })

        return super.onCreateOptionsMenu(menu)
    }
    //
    private fun getUserdata() {
        // один массив з двох
        for(i in MyDL.getLyricsCount()){

            //val newline = Lyrics(ImageUrl[i],heading[i])
            val newline = MyDL.getLyrics(i)
            newArrayList.add(newline)

        }

        tempArrayList.addAll(newArrayList)

        // з'єднування Мейна з Адаптером
        val adapter = MyAdapter(tempArrayList)
        newRecylerview.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            // Відкриття Актівіті за допомогою натискання на ітем
            override fun onItemClick(position: Int) {

                // Передача даних з одного класу в інший
                val intent = Intent(this@MainActivity,LyricsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("ImageUrl",newArrayList[position].ImageUrl)
                intent.putExtra("lyrics",MyDL.getLyricsContext(position))
                startActivity(intent)

            }
        })
    }
}