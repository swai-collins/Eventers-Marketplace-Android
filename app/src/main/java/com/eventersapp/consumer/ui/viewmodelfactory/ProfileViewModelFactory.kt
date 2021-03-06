package com.eventersapp.consumer.ui.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eventersapp.consumer.data.repositories.ProfileRepository
import com.eventersapp.consumer.ui.viewmodel.ProfileViewModel

@Suppress("UNCHECKED_CAST")
class ProfileViewModelFactory(
    private val repository: ProfileRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProfileViewModel(repository) as T
    }
}