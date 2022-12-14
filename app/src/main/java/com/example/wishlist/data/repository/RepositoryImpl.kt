package com.example.wishlist.data.repository

import com.example.wishlist.data.localdatasource.LocalDataSourceImpl
import com.example.wishlist.data.localdatasource.LocalGroup
import com.example.wishlist.domain.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryImpl(private val localDataSourceImpl: LocalDataSourceImpl) : Repository {
     override fun getGroupsFromLocalDataSource(): Flow<List<LocalGroup>> {
        return flow {
            emit(localDataSourceImpl.getGroups())
        }
    }
}