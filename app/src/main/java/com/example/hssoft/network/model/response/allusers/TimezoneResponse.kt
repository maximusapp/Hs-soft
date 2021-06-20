package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class TimezoneResponse(
    @field:SerializedName("offset") val offset: String?,
    @field:SerializedName("description") val description: String?,
)