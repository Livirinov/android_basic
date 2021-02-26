package com.example.homework2
import kotlin.math.sqrt

fun main() {
    val solutionSum = solveEquation(a = 1, b = 6, c = 9)
    println("Sum = $solutionSum")
}

fun solveEquation(a: Int, b: Int, c: Int): Any {
    val D = (b*b -4*a*c).toDouble() // Calculating discriminant
    if (D<0) return "There's no solution. Discriminant <0." else {
        val x1 = (-b + sqrt(D)) / (2 * a) // Calculating first root of the equation
        val x2 = (-b - sqrt(D)) / (2 * a) // Calculating second root of the equation

        println("x1 = $x1, x2 = $x2")
        return x1 + x2
    }
}