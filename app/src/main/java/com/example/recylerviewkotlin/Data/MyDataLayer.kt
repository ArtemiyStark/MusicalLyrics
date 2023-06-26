package com.example.recylerviewkotlin.Data

import android.content.res.Resources
import com.bumptech.glide.load.engine.Resource
import com.example.recylerviewkotlin.R


import java.util.*
//import com.example.recylerviewkotlin.Data.Lyrics
class MyDataLayer {
    // масив назв пісень і авторів
    lateinit var heading : Array<String>
    // масив текстів пісень
    lateinit var lyrics :  Array<String>
    // масив посилань
    lateinit var ImageUrl :  Array<String>

    constructor()
    {
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
            Resources.getSystem().getString(R.string.heading_a),
            Resources.getSystem().getString(R.string.heading_b),
            Resources.getSystem().getString(R.string.heading_c),
            Resources.getSystem().getString(R.string.heading_d),
            Resources.getSystem().getString(R.string.heading_e),
            Resources.getSystem().getString(R.string.heading_f)
        )
        // вміст масиву текстів пісень
        lyrics = arrayOf(

            Resources.getSystem().getString(R.string.song_a),
            Resources.getSystem().getString(R.string.song_b),
            Resources.getSystem().getString(R.string.song_c),
            Resources.getSystem().getString(R.string.song_d),
            Resources.getSystem().getString(R.string.song_e),
            Resources.getSystem().getString(R.string.song_f)
        )
    }
    fun getLyricsCount(): IntRange{
        return ImageUrl.indices
    }
    fun getLyrics(i: Int): Lyrics{
        return Lyrics(ImageUrl[i],heading[i])
    }
    fun getLyricsContext(i: Int): String{
        return lyrics[i]
    }
}