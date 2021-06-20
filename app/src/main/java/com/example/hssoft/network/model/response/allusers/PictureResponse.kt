package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class PictureResponse(
    @field:SerializedName("large") val large: String?,
    @field:SerializedName("medium") val medium: String?,
    @field:SerializedName("thumbnail") val thumbnail: String?
)