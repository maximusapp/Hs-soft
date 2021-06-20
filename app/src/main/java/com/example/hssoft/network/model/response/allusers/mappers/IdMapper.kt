package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.IdEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.IdResponse

object IdMapper : Mapper<IdResponse?, IdEntity> {
    override fun map(input: IdResponse?): IdEntity {
        return IdEntity(
                input?.name,
                input?.value
        )
    }
}