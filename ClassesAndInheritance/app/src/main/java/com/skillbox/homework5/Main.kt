package com.skillbox.homework5

import com.skillbox.homework5.oop.*

fun main() {
    val ordinaryRoom = Room(20.0).getDescription()
    val kitchen = Kitchen(20.0).getDescription()
    val bedroom = Bedroom(20.0).getDescription()
    val livingRoom = LivingRoom(30.0).getDescription()
    val bathroom = Bathroom(10.0).getDescription()
    val childrensRoom = ChildrensRoom(30.0).getDescription()
    val freeRoom = FreeRoom(10.0, "Кладовка").getDescription()
}
