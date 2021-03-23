package com.skillbox.homework7

sealed class Wallets {

    abstract fun moneyInUSD(): Double

    object virtualWallet: Wallets() {
        var rubleValue: Double = 0.0
            private set
        var euroValue: Double = 0.0
            private set
        var usdValue: Double = 0.0
            private set

        fun addMoney(currency: Currencies, value: Double) {
            when (currency) {
                Currencies.RUBLE -> rubleValue += value
                Currencies.EURO -> euroValue += value
                Currencies.USD -> usdValue += value
            }
        }

        override fun moneyInUSD(): Double {
            return  usdValue + Currencies.RUBLE.convertToUSD(rubleValue) +
                        + Currencies.EURO.convertToUSD(euroValue)
        }

        override fun toString(): String {
            return  "Money in virtual wallet: RUR = $rubleValue, EUR = $euroValue, USD = $usdValue"
        }
    }

    object realWallet: Wallets() {
        private val rubleBanknotes = emptyMap<Int, Int>().toMutableMap()
        private val euroBanknotes = emptyMap<Int, Int>().toMutableMap()
        private val usdBanknotes = emptyMap<Int, Int>().toMutableMap()

        fun addMoney(currency: Currencies, value: Int, count: Int) {
            when (currency) {
                Currencies.RUBLE -> if (rubleBanknotes.containsKey(value)) {
                    rubleBanknotes[value] = rubleBanknotes.getValue(value) + count
                } else rubleBanknotes[value] = count

                Currencies.EURO -> if (euroBanknotes.containsKey(value)) {
                    euroBanknotes[value] = euroBanknotes.getValue(value) + count
                } else euroBanknotes[value] = count

                Currencies.USD -> if (usdBanknotes.containsKey(value)) {
                    usdBanknotes[value] = usdBanknotes.getValue(value) + count
                } else usdBanknotes[value] = count
            }
        }

        override fun moneyInUSD(): Double {
            var moneyCount: Double = 0.0

            rubleBanknotes.forEach {
                moneyCount += Currencies.RUBLE.convertToUSD(it.component1().toDouble()) * it.component2().toDouble()
            }
            euroBanknotes.forEach {
                moneyCount += Currencies.EURO.convertToUSD(it.component1().toDouble()) * it.component2().toDouble()
            }
            usdBanknotes.forEach {
                moneyCount += Currencies.USD.convertToUSD(it.component1().toDouble()) * it.component2().toDouble()
            }

            return moneyCount
        }

        override fun toString(): String {
            println("Banknotes in real wallet: ")
            rubleBanknotes.forEach { println("${it.component1()} RUR, count ${it.component2()}") }
            euroBanknotes.forEach { println("${it.component1()} EUR, count ${it.component2()}") }
            usdBanknotes.forEach { println("${it.component1()} USD, count ${it.component2()}") }
            return ""
        }
    }
}

