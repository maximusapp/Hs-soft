package com.example.hssoft.domain.common

import io.reactivex.Single

abstract class UseCaseSingle<Type, in Params> : UseCase<Single<Type>, Params>() where Type : Any? {

    abstract override fun run(params: Params): Single<Type>
}