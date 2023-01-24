package com.example.recylerviewkotlin

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val lyricsList : ArrayList<Lyrics>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(),Filterable {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{

        fun onItemClick(position : Int)

    }

    fun setOnItemClickListener(listener: onItemClickListener){

        mListener = listener

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent,false)

        return MyViewHolder(itemView,mListener)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = lyricsList[position]
        //holder.titleImage.setImageResource(currentItem.ImageUrl)

        Glide.with(holder.titleImage)
            .load(currentItem.ImageUrl)
            .fitCenter()
            .skipMemoryCache(false)
            //.placeholder(R.drawable.load)
            .thumbnail(Glide.with(holder.titleImage).load(R.drawable.load))
            .into(holder.titleImage)

        //holder.titleImage.text = currentItem.ImageUrl
        holder.tvHeading.text = currentItem.heading



    }


    override fun getItemCount(): Int {

        return lyricsList.size
    }

    class MyViewHolder(itemView : View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvHeading)

        init {

            itemView.setOnClickListener {

                listener.onItemClick(adapterPosition)

            }


        }

        }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }

}
