package org.example.lesson2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val minutesOnTheWay = 457
    var minuteOfArrival = departureMinute + minutesOnTheWay
    var hourOfArrival = departureHour
    while (minuteOfArrival >= 60) {
        hourOfArrival += 1
        minuteOfArrival -= 60
    }
    println("Время прибытия: $hourOfArrival:$minuteOfArrival")

}