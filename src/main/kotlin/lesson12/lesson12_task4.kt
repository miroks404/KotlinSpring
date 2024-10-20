package org.example.lesson12

class DayInformationOfWeather(_dayTemperature: Int, _nightTemperature: Int, _isPrecipitation: Boolean) {

    var dayTemperature = _dayTemperature + KELVINS_TO_CELSIUS
    var nightTemperature = _nightTemperature + KELVINS_TO_CELSIUS
    var isPrecipitation = _isPrecipitation

    init {
        println(
            """
        Добавлен новый день!
        Дневная температура: $dayTemperature
        Ночная температура: $nightTemperature
        Были ли осадки? ${if (isPrecipitation) "да" else "нет"}
    """.trimIndent()
        )
    }
}

fun main() {
    val day1 = DayInformationOfWeather(286, 268, true)
}

const val KELVINS_TO_CELSIUS = -273