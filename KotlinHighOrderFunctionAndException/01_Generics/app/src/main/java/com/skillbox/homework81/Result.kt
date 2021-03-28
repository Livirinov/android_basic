package com.skillbox.homework81

sealed class Result<out T,R>(defaultValueT: T, defaultValueR: R) {
    private val itemT: T = defaultValueT

    data class Success<T,R>(val defaultValueT: T): Result<T,String>(defaultValueT, "2.0")
    data class Error<T,R>(val defaultValueR: R): Result<Int,R>(3, defaultValueR)

    fun getItemT(): T {
        return itemT
    }
}

