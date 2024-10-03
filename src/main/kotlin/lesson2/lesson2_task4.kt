package org.example.lesson2

fun main() {
    val ironOre = 11
    val crystalOre = 7
    val buff = 0.2f
    val bonusIronOre = ironOre * buff
    val bonusCrystalOre = crystalOre * buff

    println("Бонусная железная руда: " + String.format("%.0f", bonusIronOre))
    println("Бонусная кристаллическая руда: " + String.format("%.0f", bonusCrystalOre))
}