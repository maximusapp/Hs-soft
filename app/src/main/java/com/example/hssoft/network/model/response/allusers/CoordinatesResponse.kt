package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class CoordinatesResponse(
    @field:SerializedName("latitude") val latitude: String?,
    @field:SerializedName("longitude") val longitude: String?
)