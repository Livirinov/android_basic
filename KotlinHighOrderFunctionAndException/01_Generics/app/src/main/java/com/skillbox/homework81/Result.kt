package com.skillbox.homework81

sealed class Result<out T,R>(inputT: T, inputR: R) {
    data class Success<T,R>(val inputT: T): Result<T,String>(inputT, "2.0")
    data class Error<T,R>(val inputR: R): Result<Int,R>(3, inputR)
}

