package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.UserDataEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.UserDataResponse

object UserDataMapper : Mapper<UserDataResponse?, UserDataEntity> {
    override fun map(input: UserDataResponse?): UserDataEntity {
        return UserDataEntity(
                input?.gender,
                NameMapper.map(input?.name),
                LocationMapper.map(input?.location),
                input?.email,
                LoginMapper.map(input?.login),
                DobMapper.map(input?.dob),
                RegisteredMapper.map(input?.registered),
                input?.phone,
                input?.cell,
                IdMapper.map(input?.id),
                PictureMapper.map(input?.picture),
                input?.nat
        )
    }
}