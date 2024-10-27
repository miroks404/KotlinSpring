package org.example.lesson15

interface Server {
    fun serverInput(temperature: Temperature, precipitationAmount: PrecipitationAmount)
    fun serverOutput()
}

class WeatherServer(
    val listOfTemperature: MutableList<Temperature> = mutableListOf(),
    val listOfPrecipitation: MutableList<PrecipitationAmount> = mutableListOf(),
) : Server {
    override fun serverInput(temperature: Temperature, precipitationAmount: PrecipitationAmount) {
        if (temperature != null) {
            listOfTemperature.add(temperature)
        }
        if (precipitationAmount != null) {
            listOfPrecipitation.add(precipitationAmount)
        }
    }

    override fun serverOutput() {
        for (i in listOfTemperature) {
            println(i.temperature)
        }
        for (i in listOfPrecipitation) {
            println(i.precipitation)
        }
    }
}

abstract class WeatherStationStats(
    val temperature: String?,
    val precipitation: String?,
)

class Temperature(
    temperature: String,
) : WeatherStationStats(temperature, precipitation = null)

class PrecipitationAmount(
    precipitation: String,
) : WeatherStationStats(temperature = null, precipitation)

fun main() {
    val weatherServer1 = WeatherServer()

    val temperature1 = Temperature("10")
    val precipitation1 = PrecipitationAmount("110")

    weatherServer1.serverInput(temperature1, precipitation1)

    weatherServer1.serverOutput()
}