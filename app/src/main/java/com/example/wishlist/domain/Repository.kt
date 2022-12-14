package com.example.wishlist.domain

import com.example.wishlist.data.localdatasource.LocalGroup
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getGroupsFromLocalDataSource(): Flow<List<LocalGroup>>
}