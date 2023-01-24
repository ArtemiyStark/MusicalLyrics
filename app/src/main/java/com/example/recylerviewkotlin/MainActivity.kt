package com.example.recylerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import androidx.appcompat.widget.SearchView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    //
    private lateinit var newRecylerview : RecyclerView
    //
    private lateinit var newArrayList : ArrayList<Lyrics>
    //
    private lateinit var tempArrayList : ArrayList<Lyrics>
    // масив фотографій
    //lateinit var imageId : Array<Int>
    // масив назв пісень і авторів
    lateinit var heading : Array<String>
    // масив текстів пісень
    lateinit var lyrics :  Array<String>
    // масив посилань
    lateinit var ImageUrl :  Array<String>
    // Основна
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // вміст масиву фотографій
        /*imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f

        ) */
        // масив посилань на фотографії
        ImageUrl = arrayOf(
            "https://i.scdn.co/image/ab67616d0000b273319178a0be6d3ab9aa9a630d",
            "https://cdn.segodnya.ua/i/original/media/image/5ef/485/5d9/5ef4855d96564.jpg.webp",
            "https://cdns-images.dzcdn.net/images/cover/9bdc7af0262d0ef8499a66eaf8ab9a6d/500x500.jpg",
            "https://i.ytimg.com/vi/LzPrpwMKrBQ/maxresdefault.jpg",
            "https://upload.wikimedia.org/wikipedia/en/f/f8/YvesLarockRiseUpFront.jpg",
            "https://cdn000.soundstream.media/images/common/2022/5/24/cl3k0wmf20080rnoefu0mh7g3/cl3oai2sx0038qyoe9y794it2.jpeg"
        )
        // вміст масиву назв пісень і авторів
        heading = arrayOf(
            getString(R.string.heading_a),
            getString(R.string.heading_b),
            getString(R.string.heading_c),
            getString(R.string.heading_d),
            getString(R.string.heading_e),
            getString(R.string.heading_f)
        )
        // вміст масиву текстів пісень
        lyrics = arrayOf(

            getString(R.string.song_a),
            getString(R.string.song_b),
            getString(R.string.song_c),
            getString(R.string.song_d),
            getString(R.string.song_e),
            getString(R.string.song_f)
        )




        // змінна для recyclerView
        newRecylerview =findViewById(R.id.recyclerView)
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
        for(i in ImageUrl.indices){

            val lyrics = Lyrics(ImageUrl[i],heading[i])
            newArrayList.add(lyrics)

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
                intent.putExtra("lyrics",lyrics[position])
                startActivity(intent)

            }


        })

    }
}