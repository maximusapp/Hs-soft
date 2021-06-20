package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class StreetResponse(
    @field:SerializedName("number") val number: Int?,
    @field:SerializedName("name") val name: String?,
)