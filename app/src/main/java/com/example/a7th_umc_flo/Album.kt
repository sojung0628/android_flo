package com.example.a7th_umc_flo

data class Album(
    val title : String = "",
    val singer : String = "",
    var coverImg: Int? = null,
    var songs: ArrayList<Song>? = null
)
