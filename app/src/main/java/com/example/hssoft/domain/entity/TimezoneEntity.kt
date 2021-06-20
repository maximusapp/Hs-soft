package com.example.hssoft.domain.entity

import java.io.Serializable

class TimezoneEntity(
        val offset: String?,
        val description: String?,
) : Serializable