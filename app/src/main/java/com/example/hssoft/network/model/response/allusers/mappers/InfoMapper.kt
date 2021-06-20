package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.InfoEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.InfoResponse

object InfoMapper : Mapper<InfoResponse?, InfoEntity> {
    override fun map(input: InfoResponse?): InfoEntity {
        return InfoEntity(
                input?.seed,
                input?.results,
                input?.page,
                input?.version
        )
    }
}