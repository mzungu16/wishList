package com.example.wishlist.data.usecase

import com.example.wishlist.data.repository.RepositoryImpl
import com.example.wishlist.domain.MainFragmentUsecase
import com.example.wishlist.domain.Repository

class MainFragmentUsecaseImpl(private val repo: Repository) : MainFragmentUsecase {
    override val data: Repository
        get() = repo
}