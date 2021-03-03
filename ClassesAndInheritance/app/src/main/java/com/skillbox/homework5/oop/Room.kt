package com.skillbox.homework5.oop

open class Room (
    area: Double  //В квадратных метрах
) {
    val area = area

    open protected val title = "Обычная комната"

    fun getDescription() {
        println("Название комнаты: $title. Площадь = $area м^2")
    }
}
