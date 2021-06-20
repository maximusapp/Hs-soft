package com.example.hssoft.presentation

import com.example.hssoft.domain.entity.UserDataEntity

interface ListNavigationController {
    fun listItemClicked(userData: UserDataEntity)
}