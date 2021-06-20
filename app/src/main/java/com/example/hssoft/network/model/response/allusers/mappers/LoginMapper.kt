package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.LoginEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.LoginResponse

object LoginMapper : Mapper<LoginResponse?, LoginEntity> {
    override fun map(input: LoginResponse?): LoginEntity {
        return LoginEntity(
                input?.uuid,
                input?.username,
                input?.password,
                input?.salt,
                input?.md5,
                input?.sha1,
                input?.sha256
        )
    }
}