package org.example.lesson15

interface Server {
    fun toServerInput(weatherStationStats: WeatherStationStats)
    fun toServerOutput()
}

class WeatherServer(
    val listOfTemperature: MutableList<String> = mutableListOf(),
    val listOfPrecipitation: MutableList<String> = mutableListOf(),
) : Server {
    override fun toServerInput(weatherStationStats: WeatherStationStats) {
        if (weatherStationStats is Temperature) {
            listOfTemperature.add(weatherStationStats.temperature)
        }
        if (weatherStationStats is PrecipitationAmount) {
            listOfPrecipitation.add(weatherStationStats.precipitation)
        }
    }

    override fun toServerOutput() {
        for (i in listOfTemperature) {
            println(i)
        }
        for (i in listOfPrecipitation) {
            println(i)
        }
    }
}

abstract class WeatherStationStats

class Temperature(
    val temperature: String,
    val precipitation: String? = null,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitation: String,
    val temperature: String? = null,
) : WeatherStationStats()

fun main() {
    val weatherServer1 = WeatherServer()

    val temperature1 = Temperature("10")
    val precipitation1 = PrecipitationAmount("110")

    weatherServer1.toServerInput(temperature1)
    weatherServer1.toServerInput(precipitation1)

    weatherServer1.toServerOutput()
}