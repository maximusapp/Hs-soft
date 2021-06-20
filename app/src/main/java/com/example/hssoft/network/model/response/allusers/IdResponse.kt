package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class IdResponse(
    @field:SerializedName("name") val name: String?,
    @field:SerializedName("value") val value: Any?
)