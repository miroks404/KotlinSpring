package org.example.lesson14

open class Liner(
    val name: String,
    val passengerCapacity: Int = 100,
    val carryingCapacity: Int = 40,
    val speed: Int = 70,
    val breakIce: Boolean = false,
)

class Cargo(
    name: String,
    passengerCapacity: Int = 50,
    carryingCapacity: Int = 100,
    speed: Int = 50,
) : Liner(name, passengerCapacity, carryingCapacity, speed)

class IceBreaker(
    name: String,
    passengerCapacity: Int = 40,
    carryingCapacity: Int = 70,
    speed: Int = 30,
    breakIce: Boolean = true,
) : Liner(name, passengerCapacity, carryingCapacity, speed)

fun main() {
    val ship1 = Liner("Первый лайнер")
    val ship2 = Cargo("Первый грузовой")
    val ship3 = IceBreaker("Первый ледокол")
}