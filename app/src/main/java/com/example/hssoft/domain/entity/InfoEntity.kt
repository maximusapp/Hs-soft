package com.example.hssoft.domain.entity

import java.io.Serializable

class InfoEntity(
        val seed: String?,
        val results: Int?,
        val page: Int?,
        val version: String?,
) : Serializable