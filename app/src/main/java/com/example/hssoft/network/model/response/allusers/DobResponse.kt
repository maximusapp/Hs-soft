package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName
import java.util.*

class DobResponse(
    @field:SerializedName("date") val date: Date?,
    @field:SerializedName("age") val age: Int?
)