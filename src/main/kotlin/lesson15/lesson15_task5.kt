package org.example.lesson15

import kotlin.system.exitProcess

interface PassengerTransportation {
    fun passengerTransportation()
}

interface CargoTransportation {
    fun cargoTransportation()
}

interface Movement {
    fun move() { println("Проехали из точки A в точку B") }
}

class PassengerCar(
    val passengers: Int,
) : PassengerTransportation, Movement {
    override fun passengerTransportation() {
        if (passengers > MAX_PASSENGERS_IN_PASSENGER_CAR) {
            println("Пассажирский автомобиль не может перевозить более 3 пассажиров")
            exitProcess(0)
        }
        println("Перевезли $passengers пассажиров")
    }
}

class Truck(
    val passengers: Int,
    val cargo: Int,
) : PassengerTransportation, CargoTransportation, Movement {
    override fun passengerTransportation() {
        if (passengers > MAX_PASSENGERS_IN_TRUCK) {
            println("Грузовой автомобиль не может перевозить более 1 пассажира")
            exitProcess(0)
        }
        println("Перевезен $passengers пассажир")
    }

    override fun cargoTransportation() {
        if (cargo > MAX_CARGO_IN_TRUCK) {
            println("Грузовой автомобиль не может перевозить более 2000 кг")
            exitProcess(0)
        }
        println("Перевезли $cargo кг")
    }
}

fun main() {
    val truck1 = Truck(1, 2000)
    val car1 = PassengerCar(3)
    val car2 = PassengerCar(2)

    truck1.passengerTransportation()
    truck1.cargoTransportation()
    truck1.move()

    car1.passengerTransportation()
    car1.move()

    car2.passengerTransportation()
    car2.move()
}

const val MAX_PASSENGERS_IN_PASSENGER_CAR = 3
const val MAX_PASSENGERS_IN_TRUCK = 1
const val MAX_CARGO_IN_TRUCK = 2000


