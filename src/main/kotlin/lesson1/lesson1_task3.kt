package org.example.lesson1

fun main() {
    val yearOfFlight: Short = 1961
    var hourOfFlight: String = "09" // Использовал строчный тип, т.к в числовом нельзя чтобы был 0 в начале
    var minuteOfFlight: String = "07"

    println("Год взлета: $yearOfFlight")
    println("Час взлета: $hourOfFlight")
    println("Минута взлета: $minuteOfFlight")

    hourOfFlight = "10"
    minuteOfFlight = "55"

    println("Время посадки: $hourOfFlight:$minuteOfFlight")
}