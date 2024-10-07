package org.example.lesson4

fun main() {
    val isDamageToTheShip = false
    val numberOfCrew = 60
    val boxesOfProvision = 70
    val isFavorableWeather = true
    val longTimeSwimming =
        ((isDamageToTheShip != IS_SHIP_IS_DAMAGE) && (numberOfCrew >= MIN_CREW && numberOfCrew <= MAX_CREW) &&
                (boxesOfProvision > MIN_BOXES_OF_PROVISIONS)) || ((numberOfCrew == MAX_CREW) &&
                (isFavorableWeather == true) && (boxesOfProvision >= MIN_BOXES_OF_PROVISIONS))
    println("Может ли корабль отправиться в плавание? $longTimeSwimming")
}

const val IS_SHIP_IS_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOXES_OF_PROVISIONS = 50
