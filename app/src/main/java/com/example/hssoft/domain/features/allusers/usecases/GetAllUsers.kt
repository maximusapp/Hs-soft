package com.example.hssoft.domain.features.allusers.usecases

import com.example.hssoft.domain.common.UseCase
import com.example.hssoft.domain.common.UseCaseSingle
import com.example.hssoft.domain.entity.AllUsersEntity
import com.example.hssoft.domain.features.allusers.IAllUsersRepository
import io.reactivex.Single
import javax.inject.Inject

class GetAllUsers @Inject constructor(
    private val repository: IAllUsersRepository
) : UseCaseSingle<AllUsersEntity, UseCase.None>() {
    override fun run(params: None): Single<AllUsersEntity> {
        return repository.getAllUsers()
    }
}