package com.example.hssoft.domain.entity

import java.io.Serializable

class UserDataEntity(
        val gender: String?,
        val name: NameEntity?,
        val location: LocationEntity?,
        val email: String?,
        val login: LoginEntity?,
        val dob: DobEntity?,
        val registered: RegisteredEntity?,
        val phone: String?,
        val cell: String?,
        val id: IdEntity?,
        val picture: PictureEntity?,
        val nat: String?,
) : Serializable