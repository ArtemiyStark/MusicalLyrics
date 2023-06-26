package com.example.recylerviewkotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class LyricsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyrics)

        val headingLyrics : TextView = findViewById(R.id.heading)
        val mainLyrics : TextView = findViewById(R.id.lyrics)
        val imageLyrics : ImageView = findViewById(R.id.image_heading)

        val bundle : Bundle?= intent.extras
        val heading = bundle!!.getString("heading")
        val ImageUrl = bundle!!.getString("ImageUrl")
        val lyrics = bundle.getString("lyrics")

        headingLyrics.text = heading
        mainLyrics.text = lyrics
        //imageLyrics.setImageResource(imageId)
        //imageLyrics.text = ImageUrl
        Glide.with(this)
            .load(ImageUrl)
            .fitCenter()
            .skipMemoryCache(false)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            //.placeholder(R.drawable.load)
            .thumbnail(Glide.with(imageLyrics).load(R.drawable.load))
            .into(imageLyrics)

    //val button = findViewById<Button>(R.id.button)
    //    button.setOnClickListener{
    //        Toast.makeText(this, "Text", Toast.LENGTH_SHORT).show()
    //        val intent = Intent(this@LyricsActivity,ThirdActivity::class.java)
    //        startActivity(intent)
    //    }

    }
}