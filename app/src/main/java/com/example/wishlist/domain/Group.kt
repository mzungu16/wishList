package com.example.wishlist.domain

import android.graphics.Bitmap

data class Group(
    val image: Bitmap?,
    val title:String,
    val description: String,
    val numOfMembers:Int,
    val listOfMembers:List<Member>
)