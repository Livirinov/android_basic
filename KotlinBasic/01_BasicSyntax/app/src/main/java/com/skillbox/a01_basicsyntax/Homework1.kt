package com.skillbox.a01_basicsyntax

fun main() {
    val myFirstName = "Aleksei"
    val myLastName = "Livirinov"
    var height = 200
    val weight = 80f
    var isChild = height < 150 || weight < 40
    val firstName = myFirstName
    val lastName = myLastName

    var myInfo = "First name $firstName, last name $lastName, height $height, weight $weight, cnild? $isChild"
    var info = myInfo

    println(info)
    height = 1
    isChild = height < 150 || weight < 40
    myInfo = "First name $firstName, last name $lastName, height $height, weight $weight, cnild? $isChild"
    info = myInfo
    println(info)
}