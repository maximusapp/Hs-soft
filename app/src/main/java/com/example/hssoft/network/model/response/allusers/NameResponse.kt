package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class NameResponse(
    @field:SerializedName("title") val title: String?,
    @field:SerializedName("first") val first: String?,
    @field:SerializedName("last") val last: String?
)