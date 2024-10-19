package org.example.lesson12

class TemperatureAndPrecipitationData() {
    var dayTemperature = "+16"
    var nightTemperature = "-2"
    var isPrecipitation = false

    fun printAllInformation() = println(
        """
        Дневная температура: $dayTemperature
        Ночная температура: $nightTemperature
        Были ли осадки? ${if (isPrecipitation) "да" else "нет"}
    """.trimIndent()
    )
}

fun main() {
    val day1 = TemperatureAndPrecipitationData()
    val day2 = TemperatureAndPrecipitationData()

    day1.nightTemperature = "-6"

    day2.dayTemperature = "+6"
    day2.isPrecipitation = true

    day1.printAllInformation()

    println()

    day2.printAllInformation()
}