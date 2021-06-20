package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.DobEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.DobResponse

object DobMapper : Mapper<DobResponse?, DobEntity> {
    override fun map(input: DobResponse?): DobEntity {
        return DobEntity(
                input?.date,
                input?.age
        )
    }
}