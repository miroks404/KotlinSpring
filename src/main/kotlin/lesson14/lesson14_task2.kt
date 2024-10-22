package org.example.lesson14

open class Liner(
    val name: String,
    val passengerCapacity: Int = 100,
    val carryingCapacity: Int = 40,
    val speed: Int = 70,
    val typeOfLoading: String = "выдвигает горизонтальный трап со шкафута",
    val breakIce: Boolean = false,
) {
    fun printAllInformation() {
        println("""
            -Имя корабля: $name
            -Вместимость пассажиров: $passengerCapacity
            -Грузоподьемность: $carryingCapacity
            -Скорость: $speed
            -Возможность колоть лед: $breakIce
            -Тип погрузки: $typeOfLoading
        """.trimIndent())
        println()
    }
}

class Cargo(
    name: String,
    passengerCapacity: Int = 50,
    carryingCapacity: Int = 100,
    speed: Int = 50,
    typeOfLoading: String = "корабль активирует погрузочный кран",
) : Liner(name, passengerCapacity, carryingCapacity, speed, typeOfLoading)

class IceBreaker(
    name: String,
    passengerCapacity: Int = 40,
    carryingCapacity: Int = 70,
    speed: Int = 30,
    typeOfLoading: String = "открывает ворота со стороны кормы",
    breakIce: Boolean = true,
) : Liner(name, passengerCapacity, carryingCapacity, speed, typeOfLoading, breakIce)

fun main() {
    val ship1 = Liner("Первый лайнер")
    val ship2 = Cargo("Первый грузовой")
    val ship3 = IceBreaker("Первый ледокол")

    ship1.printAllInformation()
    ship2.printAllInformation()
    ship3.printAllInformation()
}