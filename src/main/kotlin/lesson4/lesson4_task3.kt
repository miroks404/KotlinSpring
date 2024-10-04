package org.example.lesson4

fun main() {
    val sunnyWeather = true
    val awningIsOpen = true
    val airHumidityInPercentages = 20
    val season = "winter"
    val favorableConditions: Boolean =
        (sunnyWeather == FAVORABLE_SUNNY_WEATHER) and (awningIsOpen == FAVORABLE_AWING_IS_OPEN) and (airHumidityInPercentages == FAVORABLE_AIR_HUMIDITY) and (season !== UNFAVORABLE_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val FAVORABLE_AIR_HUMIDITY = 20
const val FAVORABLE_SUNNY_WEATHER = true
const val FAVORABLE_AWING_IS_OPEN = true
const val UNFAVORABLE_SEASON = "winter"