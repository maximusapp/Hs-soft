package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class UserDataResponse(
    @field:SerializedName("gender") val gender: String?,
    @field:SerializedName("name") val name: NameResponse?,
    @field:SerializedName("location") val location: LocationResponse?,
    @field:SerializedName("email") val email: String?,
    @field:SerializedName("login") val login: LoginResponse?,
    @field:SerializedName("dob") val dob: DobResponse?,
    @field:SerializedName("registered") val registered: RegisteredResponse?,
    @field:SerializedName("phone") val phone: String?,
    @field:SerializedName("cell") val cell: String?,
    @field:SerializedName("id") val id: IdResponse?,
    @field:SerializedName("picture") val picture: PictureResponse?,
    @field:SerializedName("nat") val nat: String?,
)
