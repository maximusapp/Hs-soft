package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class InfoResponse(
    @field:SerializedName("seed") val seed: String?,
    @field:SerializedName("results") val results: Int?,
    @field:SerializedName("page") val page: Int?,
    @field:SerializedName("version") val version: String?,
)