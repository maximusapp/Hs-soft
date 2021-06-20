package com.example.hssoft.domain.entity

import java.io.Serializable

class LoginEntity(
        val uuid: String?,
        val username: String?,
        val password: String?,
        val salt: String?,
        val md5: String?,
        val sha1: String?,
        val sha256: String?
) : Serializable