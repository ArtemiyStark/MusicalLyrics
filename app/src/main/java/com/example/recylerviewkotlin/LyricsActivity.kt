package com.example.recylerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LyricsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyrics)

        val headingLyrics : TextView = findViewById(R.id.heading)
        val mainLyrics : TextView = findViewById(R.id.lyrics)
        val imageLyrics : ImageView = findViewById(R.id.image_heading)

        val bundle : Bundle?= intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val lyrics = bundle.getString("lyrics")

        headingLyrics.text = heading
        mainLyrics.text = lyrics
        imageLyrics.setImageResource(imageId)

    }
}