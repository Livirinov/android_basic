package com.skillbox.homework81

import com.skillbox.homework81.Result.Success
import com.skillbox.homework81.Result.Error
import kotlin.random.Random

fun main() {
    val listInt = listOf(1, 2, 3, 4, 5, 6)
    val listDouble = listOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)

    println("Целые числа под чётными номерами: " + evenItems(listInt))
    println()
    println("Вещественные числа под чётными номерами: " + evenItems(listDouble))
}

fun <T: Number> evenItems(inputList: List<T>): List<T> {
    val newList = emptyList<T>().toMutableList()
    for (index: Int in 1..(inputList.size-1) step 2) {
        newList.add(inputList[index])
    }
    return newList
}

fun returnObject(): Result<Int, String> {
    if (Random.nextBoolean()) {
        return Success<Int,String>(1)
    } else {
        return Error<Int,String>("5.0")
    }
}