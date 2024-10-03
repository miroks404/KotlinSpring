package org.example.lesson2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val minutesOnTheWay = 457
    var minuteOfArrival = departureMinute + minutesOnTheWay
    val hourOfArrival = departureHour + minuteOfArrival / MINUTES_PER_HOUR
    minuteOfArrival %= MINUTES_PER_HOUR

    println("Время прибытия: $hourOfArrival:$minuteOfArrival")
}
const val MINUTES_PER_HOUR = 60