package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.AllUsersEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.AllUsersResponse

object AllUsersMapper : Mapper<AllUsersResponse?, AllUsersEntity> {
    override fun map(input: AllUsersResponse?): AllUsersEntity {
        return AllUsersEntity(
                ArrayList(input?.results?.map { userData -> UserDataMapper.map(userData) } ?: arrayListOf()),
                InfoMapper.map(input?.info)
        )
    }
}