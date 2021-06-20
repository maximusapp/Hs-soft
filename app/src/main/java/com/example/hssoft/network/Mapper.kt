package com.example.hssoft.network

interface Mapper<T, R> where  T : Any?, R : Any? {
    fun map(input: T): R
}