package org.example.lesson1

fun main() {
    var secondsOfFlight = 6480
    var minutesOfFlight: Int
    val hoursOfFlight: Int

    minutesOfFlight = secondsOfFlight / SECONDS_PER_MINUTE_AND_MINUTES_PER_HOUR
    hoursOfFlight = minutesOfFlight / SECONDS_PER_MINUTE_AND_MINUTES_PER_HOUR
    minutesOfFlight %= SECONDS_PER_MINUTE_AND_MINUTES_PER_HOUR
    secondsOfFlight %= SECONDS_PER_MINUTE_AND_MINUTES_PER_HOUR

    println(String.format("%02d:%02d:%02d", hoursOfFlight, minutesOfFlight, secondsOfFlight))
}

const val SECONDS_PER_MINUTE_AND_MINUTES_PER_HOUR = 60
