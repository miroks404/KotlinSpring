package org.example.lesson17

private class Ship(
    private val name: String,
    val averageSpeed: Int,
    val portOfResidence: String,
) {
    var nameOfShip = name
        get() = "Название корабля: $field"
        set(value) {
            println("Название корабля нельзя поменять!")
        }
}

fun main() {
    val ship1 = Ship("Якорь", 25, "Калининград")

    ship1.nameOfShip = "апрель"

    println(ship1.nameOfShip)
}