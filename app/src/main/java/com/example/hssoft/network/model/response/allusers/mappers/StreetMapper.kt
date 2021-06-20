package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.StreetEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.StreetResponse

object StreetMapper : Mapper<StreetResponse?, StreetEntity> {
    override fun map(input: StreetResponse?): StreetEntity {
        return StreetEntity(
                input?.number,
                input?.name
        )
    }
}