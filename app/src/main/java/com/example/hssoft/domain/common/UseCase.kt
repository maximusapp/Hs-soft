package com.example.hssoft.domain.common

abstract class UseCase<out Type, in Params> where Type : Any {

    abstract fun run(params: Params): Type

    class None
}

fun none() = UseCase.None()