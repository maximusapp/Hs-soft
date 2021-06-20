package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class LoginResponse(
    @field:SerializedName("uuid") val uuid: String?,
    @field:SerializedName("username") val username: String?,
    @field:SerializedName("password") val password: String?,
    @field:SerializedName("salt") val salt: String?,
    @field:SerializedName("md5") val md5: String?,
    @field:SerializedName("sha1") val sha1: String?,
    @field:SerializedName("sha256") val sha256: String?,
)