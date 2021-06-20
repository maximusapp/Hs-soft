package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.CoordinatesEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.CoordinatesResponse

object CoordinatesMapper : Mapper<CoordinatesResponse?, CoordinatesEntity> {
    override fun map(input: CoordinatesResponse?): CoordinatesEntity {
        return CoordinatesEntity(
                input?.latitude,
                input?.longitude
        )
    }
}