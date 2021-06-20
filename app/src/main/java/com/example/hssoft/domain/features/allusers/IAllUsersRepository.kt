package com.example.hssoft.domain.features.allusers

import com.example.hssoft.domain.entity.AllUsersEntity
import io.reactivex.Single

interface IAllUsersRepository {
    fun getAllUsers(): Single<AllUsersEntity>
}