package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.TimezoneEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.TimezoneResponse

object TimezoneMapper : Mapper<TimezoneResponse?, TimezoneEntity> {
    override fun map(input: TimezoneResponse?): TimezoneEntity {
        return TimezoneEntity(
                input?.offset,
                input?.description
        )
    }
}