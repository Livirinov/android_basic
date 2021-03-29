package com.skillbox.homework81

import com.skillbox.homework81.Result.Success
import com.skillbox.homework81.Result.Error
import kotlin.random.Random

fun main() {
    val listInt = listOf(1, 2, 3, 4, 5, 6)
    val listDouble = listOf(1.0, 2.2, 3.0, 4.0, 5.0, 6.0)

    println("Whole even numbers: " + evenItems(listInt))
    println()
    println("Real even numbers: " + evenItems(listDouble))
}

fun <T: Number> evenItems(inputList: List<T>): List<T> {
    val newList = emptyList<T>().toMutableList()
    inputList.forEach{if (it.toDouble() % 2 == 0.0) newList.add(it)}
    return newList
}

fun returnObject(): Result<Int, String> {
    if (Random.nextBoolean()) {
        return Success<Int,String>(1)
    } else {
        return Error<Int,String>("5.0")
    }
}