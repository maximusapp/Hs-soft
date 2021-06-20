package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.NameEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.NameResponse

object NameMapper : Mapper<NameResponse?, NameEntity> {
    override fun map(input: NameResponse?): NameEntity {
        return NameEntity(
                input?.title,
                input?.first,
                input?.last
        )
    }
}