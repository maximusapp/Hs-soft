package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class AllUsersResponse(
    @field:SerializedName("results") val results: ArrayList<UserDataResponse>?,
    @field:SerializedName("info") val info: InfoResponse?
)
