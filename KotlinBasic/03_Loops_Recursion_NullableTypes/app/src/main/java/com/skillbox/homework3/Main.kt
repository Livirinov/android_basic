@file:Suppress("NAME_SHADOWING")

package com.skillbox.homework3

fun main() {
    println("Type a count of numbers in array:")
    val countInArray: Int = readNumber(sign = "+")!!
    var currentNumber: Int
    var countOfPositive = 0
    var sumOfNumbers = 0

    println("Now you need to type $countInArray number(s).")
    for (currentIndex: Int in 1..countInArray) {
        println("Please, type a number:")
        currentNumber = readNumber(sign = "+-")!!
        if (currentNumber > 0) countOfPositive++
        sumOfNumbers += currentNumber
    }
    println("Count of positive numbers = $countOfPositive")
    println("Sum of numbers = $sumOfNumbers")

    println("Type a number for counting GCD with $sumOfNumbers:")
    val numberForGCD: Int = readNumber(sign = "+-")!!
    print("GCD ($sumOfNumbers,$numberForGCD) = ")
    println(gcd(numberForGCD, sumOfNumbers))
}

fun readNumber(sign: String): Int? {
    var outputNumber: Int? = 0
    var isNull = true
    while (isNull) {
        outputNumber = readLine()?.toIntOrNull()
        outputNumber?.let {
                outputNumber ->
            if ((sign == "+-") || (sign == "+" &&  outputNumber>0)) isNull = false
            else {
                println("Incorrect  outputNumber. Please, type positive number.")
            }
        }
            ?: println("Incorrect input. Please, type integer.")
    }
    return outputNumber
}

tailrec fun gcd(a: Int, b: Int): Int {
    if (b == 0)
        return Math.abs(a)
    return gcd(a = b, b = a % b)
}
