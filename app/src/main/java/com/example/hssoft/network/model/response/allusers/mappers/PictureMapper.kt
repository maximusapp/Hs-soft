package com.example.hssoft.network.model.response.allusers.mappers

import com.example.hssoft.domain.entity.PictureEntity
import com.example.hssoft.network.Mapper
import com.example.hssoft.network.model.response.allusers.PictureResponse

object PictureMapper : Mapper<PictureResponse?, PictureEntity> {
    override fun map(input: PictureResponse?): PictureEntity {
        return PictureEntity(
                input?.large,
                input?.medium,
                input?.thumbnail
        )
    }
}