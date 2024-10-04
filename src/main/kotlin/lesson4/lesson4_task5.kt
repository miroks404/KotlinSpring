package org.example.lesson4

fun main() {
    val damageToTheShip = false
    val numberOfCrew = 60
    val boxesOfProvision = 70
    val weather = true
    val longTimeSwimming =
        ((damageToTheShip !== SHIP_IS_DAMAGE) and (numberOfCrew >= MIN_CREW && numberOfCrew <= MAX_CREW) and (boxesOfProvision > MIN_BOXES_OF_PROVISIONS)) or ((numberOfCrew == MAX_CREW) and (weather == FAVORABLE_WEATHER) and (boxesOfProvision >= MIN_BOXES_OF_PROVISIONS))
    println("Может ли корабль отправиться в плавание? $longTimeSwimming")
}

const val SHIP_IS_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOXES_OF_PROVISIONS = 50
const val FAVORABLE_WEATHER = true