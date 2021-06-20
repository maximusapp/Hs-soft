package com.example.hssoft.domain.entity

import java.io.Serializable

class LocationEntity(
        val street: StreetEntity?,
        val city: String?,
        val state: String?,
        val country: String?,
        val postcode: String?,
        val coordinates: CoordinatesEntity?,
        val timezone: TimezoneEntity?,
): Serializable