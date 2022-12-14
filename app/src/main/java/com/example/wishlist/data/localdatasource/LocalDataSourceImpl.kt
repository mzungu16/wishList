package com.example.wishlist.data.localdatasource

class LocalDataSourceImpl {
    fun getGroups(): List<LocalGroup> {
        return listOf(
            LocalGroup(
                "",
                "firstGroupName",
                "Some Group Descr",
                listOf(LocalMember("name1", "surname", "boroda", "892838232"))
            ), LocalGroup(
                "",
                "secondGroupName",
                "Some Group Descr",
                listOf(LocalMember("name2", "surname2", "boroda2", "892838231"))
            ),
            LocalGroup(
                "",
                "thirdGroupName",
                "Some Group Descr",
                listOf(LocalMember("name3", "surname3", "boroda3", "892838233"))
            )
        )
    }
}