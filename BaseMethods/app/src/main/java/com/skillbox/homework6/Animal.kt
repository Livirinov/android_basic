package com.skillbox.homework6

data class Animal (
    private val energy: Int,
    private val weight: Int,
    private val name: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Animal

        if (energy != other.energy) return false
        if (weight != other.weight) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = energy.hashCode()
        result = 31 * result + weight.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "Animal(energy=$energy, weight=$weight, name='$name')"
    }
}
