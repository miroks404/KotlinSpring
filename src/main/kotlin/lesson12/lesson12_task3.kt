package org.example.lesson12

class DayInformationOfWeather(_dayTemperature: Int, _nightTemperature: Int, _isPrecipitation: Boolean) {

    var dayTemperature = _dayTemperature - 273
    var nightTemperature = _nightTemperature - 273
    var isPrecipitation = _isPrecipitation

    fun printAllInformation() = println(
        """
        Дневная температура: $dayTemperature
        Ночная температура: $nightTemperature
        Были ли осадки? ${if (isPrecipitation) "да" else "нет"}
    """.trimIndent()
    )
}

fun main() {
    val day1 = DayInformationOfWeather(286, 268, true)

    day1.printAllInformation()
}
