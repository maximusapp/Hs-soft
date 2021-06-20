package com.example.hssoft.core.di

import com.example.hssoft.data.features.repository.AllUsersRepository
import com.example.hssoft.domain.features.allusers.IAllUsersRepository
import com.example.hssoft.network.service.AllUsersService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
@InstallIn(ApplicationComponent::class)
class AllUsersRepositoryModule {
    @Provides
    @Singleton
    fun allUsersRepo(retrofit: Retrofit): IAllUsersRepository =
        AllUsersRepository(retrofit.create(AllUsersService::class.java))
}