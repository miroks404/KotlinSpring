package org.example.lesson2

import kotlin.math.pow

fun main() {
    var depositAmount = 70000.00
    val percentPerYear = 0.167
    val durationOfDeposit = 20

    depositAmount = depositAmount * (1 + percentPerYear).pow(durationOfDeposit)

    println("Ваш размер вклада через $durationOfDeposit лет будет: " + String.format("%.03f", depositAmount))
}