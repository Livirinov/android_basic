@file:Suppress("NAME_SHADOWING")

package com.skillbox.homework4

fun main() {
    println("Сколько номеров телефонов Вы желаете ввести?")
    val countInList: Int = readNumber(sign = "+")

    println("Пожалуйста, введите их.")
    val listOfPhones = readStrings(countInList)
    println("Принято.")
    println()

    val uniqPhones = listOfPhones.toSet()
    val russianPhones = uniqPhones.filter { string ->
        string.length >= 2 && string[0] == '+' && string[1] == '7'
    }
    println("Телефоны из списка, начинающиеся с +7: ")
    russianPhones.forEach{println(it)}
    println()

    println("Количество уникальных телефонов: "+uniqPhones.size)

    println("Сумма длин всех номеров телефонов: "+listOfPhones.sumBy{it.length})
    println()

    val mapPhones = emptyMap <String, String> ().toMutableMap()
    for (phone: String in uniqPhones) {
        print("Введите имя человека с номером телефона $phone: ")
        mapPhones.put(phone, readStrings(1).first())
    }
    println()
    mapPhones.forEach{println("Человек: ${it.value}. Номер телефона: ${it.key}")}
}

fun readNumber(sign: String): Int {
    var outputNumber: Int? = 0
    var isNull = true
    while (isNull) {
        outputNumber = readLine()?.toIntOrNull()
        outputNumber?.let {
                outputNumber ->
            if ((sign == "+-") || (sign == "+" &&  outputNumber>0)) isNull = false
            else {
                println("Некорректные данные. Пожалуйста, введите положительное число.")
            }
        }
            ?: println("Некорректные данные. Пожалуйста, введите целое число.")
    }
    return outputNumber!!
}

fun readStrings(countInList: Int): MutableList <String> {
    val listOfPhones = emptyList<String>().toMutableList()
    var currentString: String
    var currentIndex: Int = 0
    while (currentIndex < countInList) {
        currentString = readLine()!!
        if (currentString.replace(" ","") != "") {
            listOfPhones.add(currentString)
            currentIndex ++
        }
        else println("Некорректные данные. Пожалуйста, введите непустую строку.")
    }
    return listOfPhones
}
