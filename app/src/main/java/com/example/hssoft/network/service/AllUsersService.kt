package com.example.hssoft.network.service

import com.example.hssoft.network.model.response.allusers.AllUsersResponse
import io.reactivex.Single
import retrofit2.http.GET

interface AllUsersService {

    @GET("api")
    fun getAllUsers(): Single<AllUsersResponse>

}