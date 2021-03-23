package com.skillbox.homework7

fun main() {
//    println("${Currencies.EURO.convertToUSD(50.0)} USD")
    val walletVirt = Wallets.virtualWallet
    val walletReal = Wallets.realWallet

    with(walletVirt) {

        addMoney(Currencies.RUBLE, 555.5)
        addMoney(Currencies.RUBLE, 0.5)
        addMoney(Currencies.USD, 0.0)
        addMoney(Currencies.USD, -1.1)

        println("Money in vitrual wallet in USD: " + moneyInUSD())
    }
    println(walletVirt)
    println()

    with(walletReal) {

        addMoney(Currencies.RUBLE, 2000, 1)
        addMoney(Currencies.RUBLE, 100, 2)
        addMoney(Currencies.RUBLE, 100, 3)
        addMoney(Currencies.USD, 5, 0)
        addMoney(Currencies.USD, 1, -1)

        println("Money in real wallet in USD: " + moneyInUSD())
    }
    println(walletReal)
}

val Currencies.isNationalCurrency: Boolean
    get() = this == Currencies.nationalCurrency

fun Currencies.convertToUSD(value: Double): Double {
    return when (this) {
        Currencies.RUBLE -> value * CurrencyConverter.rublesInUSD
        Currencies.EURO -> value * CurrencyConverter.eurosInUSD
        Currencies.USD -> value
    }
}

object CurrencyConverter {
    val rublesInUSD: Double = 0.013
    val eurosInUSD: Double = 1.173
}

