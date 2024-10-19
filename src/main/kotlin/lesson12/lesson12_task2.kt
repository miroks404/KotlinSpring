package org.example.lesson12

class DataOfTemperatureAndPrecipitation(
    val dayTemperature: String, val nightTemperature: String,
    val isPrecipitation: Boolean
) {
    fun printAllInformation() = println(
        """
        Дневная температура: $dayTemperature
        Ночная температура: $nightTemperature
        Были ли осадки? ${if (isPrecipitation) "да" else "нет"}
    """.trimIndent()
    )
}

fun main() {
    val day1 = DataOfTemperatureAndPrecipitation("+6", "-5", true)

    day1.printAllInformation()
}