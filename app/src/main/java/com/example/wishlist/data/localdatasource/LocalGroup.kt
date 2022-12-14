package com.example.wishlist.data.localdatasource

data class LocalGroup(
    val avatarPicture: String,
    val groupName: String,
    val groupDescription: String,
    val listOfMembers: List<LocalMember>
)