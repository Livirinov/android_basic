package com.skillbox.homework81

import com.skillbox.homework81.Result.Success
import com.skillbox.homework81.Result.Error
import kotlin.random.Random

fun main() {
    val listLong = listOf(-0L, +0L, 1L, 2L, Long.MIN_VALUE, Long.MAX_VALUE)
    val listDouble = listOf(-0.0, +0.0, 1.0, -2.0, 3.0, 4.0, 5.5, 6.5)

    println("Whole even numbers: " + evenItems(listLong))
    println()
    println("Real even numbers: " + evenItems(listDouble))
}

fun <T: Number> evenItems(inputList: List<T>): List<T> {
    val newList = emptyList<T>().toMutableList()
    inputList.forEach{if (it.toDouble() - it.toLong() == 0.0 && it.toLong() % 2 == 0L) newList.add(it)}
    return newList
}

fun returnObject(): Result<Int, String> {
    if (Random.nextBoolean()) {
        return Success<Int,String>(1)
    } else {
        return Error<Int,String>("5.0")
    }
}