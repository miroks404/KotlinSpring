package org.example.lesson4

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val airHumidityInPercentages = 20
    val season = "winter"
    val favorableConditions =
        (isSunnyWeather == IS_FAVORABLE_SUNNY_WEATHER) && (isAwningOpen == IS_FAVORABLE_AWING_IS_OPEN) &&
                (airHumidityInPercentages == FAVORABLE_AIR_HUMIDITY) && (season != UNFAVORABLE_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val FAVORABLE_AIR_HUMIDITY = 20
const val IS_FAVORABLE_SUNNY_WEATHER = true
const val IS_FAVORABLE_AWING_IS_OPEN = true
const val UNFAVORABLE_SEASON = "winter"