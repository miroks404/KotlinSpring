package org.example.lesson12

class DayInformationOfWeather(_dayTemperature: Int, _nightTemperature: Int, _isPrecipitation: Boolean) {

    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isPrecipitation = _isPrecipitation

    fun printAllInformation() = println(
        """
        Дневная температура: $dayTemperature
        Ночная температура: $nightTemperature
        Были ли осадки? ${if (isPrecipitation) "да" else "нет"}
    """.trimIndent()
    )

    init {
        dayTemperature -= 273
        nightTemperature -= 273
    }
}

fun main() {
    val day1 = DayInformationOfWeather(286, 268, true)

    day1.printAllInformation()
}
