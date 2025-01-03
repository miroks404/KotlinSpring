package org.example.lesson14

open class Liner(
    val name: String,
    val passengerCapacity: Int = 100,
    val carryingCapacity: Int = 40,
    val speed: Int = 70,
    val breakIce: Boolean = false,
) {

    open fun getTypeOfLoading(): String {
        return "-Тип погрузки: выдвигает горизонтальный трап со шкафута"
    }

    fun printAllInformation() {
        println(
            """
            -Имя корабля: $name
            -Вместимость пассажиров: $passengerCapacity
            -Грузоподьемность: $carryingCapacity
            -Скорость: $speed
            -Возможность колоть лед: $breakIce
            ${getTypeOfLoading()}
        """.trimIndent()
        )
        println()
    }
}

class Cargo(
    name: String,
    passengerCapacity: Int = 50,
    carryingCapacity: Int = 100,
    speed: Int = 50,
) : Liner(name, passengerCapacity, carryingCapacity, speed) {
    override fun getTypeOfLoading(): String {
        return "-Тип погрузки: корабль активирует погрузочный кран"
    }
}

class IceBreaker(
    name: String,
    passengerCapacity: Int = 40,
    carryingCapacity: Int = 70,
    speed: Int = 30,
    breakIce: Boolean = true,
) : Liner(name, passengerCapacity, carryingCapacity, speed, breakIce) {
    override fun getTypeOfLoading(): String {
        return "-Тип погрузки: открывает ворота со стороны кормы"
    }
}

fun main() {
    val ship1 = Liner("Первый лайнер")
    val ship2 = Cargo("Первый грузовой")
    val ship3 = IceBreaker("Первый ледокол")

    ship1.printAllInformation()
    ship2.printAllInformation()
    ship3.printAllInformation()
}