package com.skillbox.homework6

import kotlin.random.Random.Default.nextInt

class Person (
    private val height: Int,
    private val weight: Int,
    val name: String,
    ) {

    val pets = emptySet<Animal>().toHashSet()

    fun buyPet() {
        pets += Animal(
            energy = nextInt(from = 0, until = 100),
            weight = nextInt(from = 1, until = 100),
            name = "Pet №${nextInt(from = 1, until = 100)}"
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (height != other.height) return false
        if (weight != other.weight) return false
        if (name != other.name) return false
        if (pets != other.pets) return false

        return true
    }

    override fun hashCode(): Int {
        var result = height.hashCode()
        result = 31 * result + weight.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + pets.hashCode()
        return result
    }

    override fun toString(): String {
        return "Person(height=$height, weight=$weight, name='$name', pets=$pets)"
    }
}
