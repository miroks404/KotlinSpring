package org.example.lesson2

fun main() {
    val ironOre = 11
    val crystalOre = 7
    val buff = 20
    val buffInFraction = buff.toFloat() / 100
    val bonusIronOre = ironOre * buffInFraction
    val bonusCrystalOre = crystalOre * buffInFraction

    println("Бонусная железная руда: " + String.format("%.0f", bonusIronOre))
    println("Бонусная кристаллическая руда: " + String.format("%.0f", bonusCrystalOre))
}