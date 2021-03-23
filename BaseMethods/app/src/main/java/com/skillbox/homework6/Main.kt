     package com.skillbox.homework6

import com.skillbox.homework6.Person

fun main() {
    val person1 = Person(height = 180, weight = 90, "Ivan")
    val person2 = Person(height = 180, weight = 90, "Ivan")
    val person3 = Person(height = 160, weight = 55, "Maria")

    val setOfPersons = mutableSetOf(person1, person2)
    println(setOfPersons.size)

    setOfPersons += person3
    println(setOfPersons.size)

    setOfPersons.forEach {println(it)}
    println()

    val countPets = 3
    for (indexPets:Int in 1..countPets)
        setOfPersons.forEach { it.buyPet()}

    setOfPersons.forEach {println("${it.name}'s pets: " + it.pets)}
}