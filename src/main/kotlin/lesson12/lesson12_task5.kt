package org.example.lesson12

import kotlin.random.Random

class DayInformationOfWeather(_dayTemperature: Int, _nightTemperature: Int, _isPrecipitation: Boolean) {

    var dayTemperature = _dayTemperature + KELVINS_TO_CELSIUS
    var nightTemperature = _nightTemperature + KELVINS_TO_CELSIUS
    var isPrecipitation = _isPrecipitation

}

fun main() {
    val listOfMonthDays: MutableList<DayInformationOfWeather> = mutableListOf()
    for (i in 1..30) {
        val newDay = DayInformationOfWeather((243..303).random(), (243..303).random(), Random.nextBoolean())
        listOfMonthDays.add(newDay)
    }

    val listOfDaysTemperatures: MutableList<Int> = mutableListOf()
    for (i in listOfMonthDays) {
        listOfDaysTemperatures.add(i.dayTemperature)
    }

    val listOfNightsTemperatures: MutableList<Int> = mutableListOf()
    for (i in listOfMonthDays) {
        listOfNightsTemperatures.add(i.nightTemperature)
    }

    val listOfDaysWithPrecipitation: MutableList<Boolean> = mutableListOf()
    for (i in listOfMonthDays) {
        if (i.isPrecipitation) listOfDaysWithPrecipitation.add(i.isPrecipitation)
    }

    println("Среднее значение дневных температур: ${listOfDaysTemperatures.average()}")
    println("Среднее значение ночных температур: ${listOfNightsTemperatures.average()}")
    println("Количество дней с осадками: ${listOfDaysWithPrecipitation.count()}")
}

const val KELVINS_TO_CELSIUS = -273