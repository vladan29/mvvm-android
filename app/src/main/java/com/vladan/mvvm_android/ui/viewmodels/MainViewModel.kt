package com.vladan.mvvm_android.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.vladan.mvvm_android.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
):ViewModel() {
}