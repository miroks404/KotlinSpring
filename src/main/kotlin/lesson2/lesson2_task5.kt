package org.example.lesson2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    var percentPerYear = 16.7
    val durationOfDeposit = 20
    percentPerYear /= PERCENTAGES_TO_FRACTIONS
    val resultDepositAmount =
        depositAmount.toDouble() * (NUMBER_FOR_COMPOUND_INTEREST + percentPerYear).pow(durationOfDeposit)

    println("Ваш размер вклада через $durationOfDeposit лет будет: " + String.format("%.03f", resultDepositAmount))
}

const val NUMBER_FOR_COMPOUND_INTEREST = 1
const val PERCENTAGES_TO_FRACTIONS = 100