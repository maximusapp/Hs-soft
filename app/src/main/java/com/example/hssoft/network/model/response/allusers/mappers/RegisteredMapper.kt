package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.RegisteredEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.RegisteredResponse

object RegisteredMapper : Mapper<RegisteredResponse?, RegisteredEntity> {
    override fun map(input: RegisteredResponse?): RegisteredEntity {
        return RegisteredEntity(
                input?.date,
                input?.age
        )
    }
}