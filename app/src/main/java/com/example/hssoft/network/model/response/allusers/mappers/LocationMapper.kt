package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.LocationEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.LocationResponse

object LocationMapper : Mapper<LocationResponse?, LocationEntity> {
    override fun map(input: LocationResponse?): LocationEntity {
        return LocationEntity(
                StreetMapper.map(input?.street),
                input?.city,
                input?.state,
                input?.country,
                input?.postcode,
                CoordinatesMapper.map(input?.coordinates),
                TimezoneMapper.map(input?.timezone)
        )
    }
}