package com.example.hssoft.data.features.repository

import com.example.hssoft.domain.entity.AllUsersEntity
import com.example.hssoft.domain.features.allusers.IAllUsersRepository
import com.example.hssoft.network.model.response.allusers.mappers.AllUsersMapper
import com.example.hssoft.network.service.AllUsersService
import io.reactivex.Single

class AllUsersRepository(private val allUsersService: AllUsersService) : IAllUsersRepository {

    override fun getAllUsers(): Single<AllUsersEntity> {
        return allUsersService.getAllUsers().map {
            AllUsersMapper.map(it)
        }
    }

}
