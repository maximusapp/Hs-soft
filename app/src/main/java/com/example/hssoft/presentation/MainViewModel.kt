package com.example.hssoft.presentation

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hssoft.domain.common.UseCase
import com.example.hssoft.domain.entity.AllUsersEntity
import com.example.hssoft.domain.features.allusers.usecases.GetAllUsers

class MainViewModel @ViewModelInject constructor(
    private val getAllUsers: GetAllUsers
) : ViewModel() {

    private val allUsersResource: MutableLiveData<AllUsersEntity> = MutableLiveData()
    fun allUsersUpdate() = allUsersResource

    init {
        getAllUsers()
    }

    private fun getAllUsers() {
        getAllUsers.run(UseCase.None())
            .subscribe({ allUsers ->
                allUsersResource.postValue(allUsers)
            }, {
                println("ERROR ${it.printStackTrace()}")
            })
    }

}