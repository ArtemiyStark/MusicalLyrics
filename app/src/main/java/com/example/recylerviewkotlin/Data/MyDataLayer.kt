package com.example.recylerviewkotlin.Data

import android.content.res.Resources
import com.example.recylerviewkotlin.R

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
        /* heading = arrayOf(
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
        ) */

        heading = arrayOf(
            "Skull Throne\n\nBlack Trinity",
            "Як у нас на Україні\n\nКатерина Бужинська",
            "Soft and Wet\n\nPrince",
            "Море\n\nСкрябін",
            "Rise Up\n\nYves Larock",
            "Rise Up\n\nThomas Jack & Jasmine Thompson"
        )
        // вміст масиву текстів пісень
        lyrics = arrayOf(

            "        Pour from the gates like a tide of rage and steel\n" +
                    "        Beheading our foes to add to the Throne of Skulls\n" +
                    "        Hurling our weapons with demonic screams\n" +
                    "        Countless men fall to our wicked onslaught\n" +
                    "        Hate-frenzied hacking, the ground slick with gore\n" +
                    "        Vicious assault, no regard for friend or foe\n" +
                    "        Bellowing war cries as our skull piles grow\n" +
                    "        We will not stop till our skin is stained with blood\n" +
                    "        Lord / on your Throne / we shed blood / in your name\n" +
                    "        Blood / on our hands / is the blood / of their god slain\n" +
                    "        Blood for the Blood God, skulls for the Skull Throne\n" +
                    "        Blood for the Blood God, skulls for the Skull Throne\n" +
                    "        Blood for the Blood God, skulls for the Skull Throne\n" +
                    "        All hail the Blood God / upon the Skull Throne\n\n",

            "        Тече річка-невеличка, через гори, через гай.\n" +
                    "        Рано вранці небо кличе: \"Вставай, сонце, вставай\".\n" +
                    "        Розбуди усе навколо, хай почує рідний край.\n" +
                    "        Пісню гарну, серцю милу, добрим людям співай.\n" +
                    "        Як у нас на Україні - всі лани квітучи, так у нас на Україні - люди всі співучи.\n" +
                    "        Хай же щастя буде довгим і пісень багато, бо без пісні в Україні не буває свята.\n" +
                    "        Як у нас на Україні - всі лани квітучи, так у нас на Україні - люди всі співучи.\n" +
                    "        Хай же щастя буде довгим і пісень багато, бо без пісні в Україні не буває свята.\n" +
                    "        Тече річка в синє море, прокладає собі путь.\n" +
                    "        І малі струмки прозорі, сивині все отдають.\n" +
                    "        По землі вода гуляє, напуває рідний край.\n" +
                    "        Все довкола оживає: \"Співай, земле, співай\".\n" +
                    "        Як у нас на Україні - всі лани квітучи, так у нас на Україні - люди всі співучи.\n" +
                    "        Хай же щастя буде довгим і пісень багато, бо без пісні в Україні не буває свята.\n" +
                    "        Як у нас на Україні - всі лани квітучи, так у нас на Україні - люди всі співучи.\n" +
                    "        Хай же щастя буде довгим і пісень багато, бо без пісні в Україні не буває свята.\n" +
                    "        Як у нас на Україні - всі лани квітучи, так у нас на Україні - люди всі співучи.\n" +
                    "        Хай же щастя буде довгим і пісень багато, бо без пісні в Україні не буває свята.\n" +
                    "        Як у нас на Україні - всі лани квітучи, так у нас на Україні - люди всі співучи.\n" +
                    "        Хай же щастя буде довгим і пісень багато, бо без пісні в Україні не буває свята.\n\n",

            "        Hey, lover, I got a sugarcane\n" +
                    "        That I want to lose in you\n" +
                    "        Baby, can you stand the pain?\n" +
                    "        Hey, lover, sugar don`t you see?\n" +
                    "        There`s so many things that you do to me\n" +
                    "        Ooh, baby\n" +
                    "        All I want to see is the love in your eyes (hey, lover)\n" +
                    "        And all I wanna hear is your sweet love sighs\n" +
                    "        All I wanna feel is a burning flame (hey, lover)\n" +
                    "        Tell me, tell me, baby, that you feel the same\n" +
                    "        Tell me that you feel the same way I do\n" +
                    "        Tell me that you love me, girl\n" +
                    "        If this is lust, then I must\n" +
                    "        Confess I feel it every day (every way)\n" +
                    "        If this is wrong, then I long\n" +
                    "        To be as far from right as I may\n" +
                    "        Soft and wet\n" +
                    "        Soft and wet\n" +
                    "        Soft and wet\n" +
                    "        Soft and wet\n" +
                    "        Every time I`m with you, you just love me to death\n" +
                    "        Ooh-wee, baby, you leave me without\n" +
                    "        Breath\n" +
                    "        Oh, baby, ooh, yeah\n" +
                    "        You`re just as soft as a lion tamed (hey, lover)\n" +
                    "        You`re just as wet as the evening rain\n" +
                    "        And I really dig it when you call my name (hey, lover)\n" +
                    "        Your love is driving me\n" +
                    "        You`re driving me insane\n" +
                    "        Crazy, baby\n" +
                    "        Oh, girl\n" +
                    "        Crazy about your love\n" +
                    "        Soft and wet (you know)\n" +
                    "        You are soft and wet (oh, sugar)\n" +
                    "        Your love is soft and wet\n" +
                    "        Soft and wet\n\n",

            "        Най цiлий свiт пропаде, я пожити хочу сам.\n" +
                    "        Кругом однi вар`яти, я вар`ятом чуть не став.\n" +
                    "        Я маю досить ваших злих i ненормальних слiв\n" +
                    "        Я хочу бути корабльом на свому морi снiв\n" +
                    "        Оооооо-оо то моє море,\n" +
                    "        Оо-оо-о-о то моє, моє море,\n" +
                    "        Ооооооо-о то моє море,\n" +
                    "        Оо-о-о-оо то моє, моє море.\n" +
                    "        Зеленi люди ходять самi на себе злi.\n" +
                    "        Зеленi торби носять, а вони такi тяжкi.\n" +
                    "        Я хочу в своє море, я хочу бути сам,\n" +
                    "        Тi свої тихi сни я нiкому не вiддам.\n" +
                    "        Оооооо-оо то моє море,\n" +
                    "        Оо-оо-о-о то моє, моє море,\n" +
                    "        Ооооооо-о то моє море,\n" +
                    "        Оо-о-о-оо то моє, моє море.\n" +
                    "        Далеко в лiсi ходять маленькi муравлi,\n" +
                    "        Про шось своє говорять всi свої i всi чужi.\n" +
                    "        А в мене в морi риби ходять тихо та, як я.\n" +
                    "        Я хочу своє море, то моя нiма сiм`я.\n" +
                    "        Оооооо-оо то моє море,\n" +
                    "        Оо-оо-о-о то моє, моє море,\n" +
                    "        Ооооооо-о то моє море,\n" +
                    "        Оо-о-о-оо то моє, моє море.\n" +
                    "        То моє море.\n\n",

            "        Rise up\n" +
                    "        And don`t falling down again\n" +
                    "        Rise up\n" +
                    "        Long time I broke the chains\n" +
                    "        I tried to fly away\n" +
                    "        So high\n" +
                    "        Direction, sky!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        I tried to fly away\n" +
                    "        So high\n" +
                    "        Direction, sky!\n" +
                    "        I tried to fly away\n" +
                    "        So high\n" +
                    "        Direction, sky!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        Rise up, rise up, rise up, rise up\n" +
                    "        We`ll meet again\n" +
                    "        Rise up, rise up, rise up, rise up\n" +
                    "        For my mind and my brain\n" +
                    "        `Cause I tried to fly\n" +
                    "        So high\n" +
                    "        Direction, sky!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n" +
                    "        My dream is to fly\n" +
                    "        Over the rainbow, so high!\n\n",

            "        Wisdom, like water, runs down to my feet\n" +
                    "        The more that you tell me, the less I can sleep\n" +
                    "        Time is a weapon that takes every man\n" +
                    "        Oh, let me be young, I won`t understand\n" +
                    "        Rise up like smoke, let the air choke\n" +
                    "        Mountains are crumbling down, oh, let them go\n" +
                    "        Rise up the sea, oh, let me be\n" +
                    "        And let the waves crash over me\n" +
                    "        (And let the waves crash over me)\n" +
                    "        Let go of reasons, surrender to fate\n" +
                    "        The apple of Eden is all yours to taste\n" +
                    "        Nobody`s perfect and things will be rough\n" +
                    "        Love conquers all, so let there be love\n" +
                    "        Rise up like smoke, let the air choke\n" +
                    "        Mountains come crumbling down, oh, let them go\n" +
                    "        Rise up the sea, oh, let me be\n" +
                    "        Rise up the sea, oh, let me be\n" +
                    "        And let the waves crash over me\n" +
                    "        Rise up the sea, oh, let me be\n" +
                    "        And let the waves crash over me\n" +
                    "        Rise up the sea, oh, let me be\n" +
                    "        And let the waves crash over me\n\n"
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