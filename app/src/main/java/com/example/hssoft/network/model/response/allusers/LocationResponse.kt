package com.example.hssoft.network.model.response.allusers

import com.google.gson.annotations.SerializedName

class LocationResponse(
    @field:SerializedName("street") val street: StreetResponse?,
    @field:SerializedName("city") val city: String?,
    @field:SerializedName("state") val state: String?,
    @field:SerializedName("country") val country: String?,
    @field:SerializedName("postcode") val postcode: String?,
    @field:SerializedName("coordinates") val coordinates: CoordinatesResponse?,
    @field:SerializedName("timezone") val timezone: TimezoneResponse?,
)