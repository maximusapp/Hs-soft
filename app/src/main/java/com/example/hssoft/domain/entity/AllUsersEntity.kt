package com.example.hssoft.domain.entity

import java.io.Serializable

class AllUsersEntity(
        val results: ArrayList<UserDataEntity>?,
        val info: InfoEntity?
) : Serializable