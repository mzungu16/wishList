package com.example.wishlist.ui.mainFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wishlist.data.localdatasource.LocalGroup
import com.example.wishlist.domain.MainFragmentUsecase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainFragmentViewModel(private val usecase: MainFragmentUsecase) : ViewModel() {
    private val _liveDataToObserve = MutableLiveData<List<LocalGroup>>()
    val liveDataToObserve: LiveData<List<LocalGroup>> get() = _liveDataToObserve
    fun getGroupsFromViewModel() {
        viewModelScope.launch {
            usecase.data.getGroupsFromLocalDataSource().collect {
                _liveDataToObserve.postValue(it)
            }
        }
    }
}