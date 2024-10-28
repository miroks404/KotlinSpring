package org.example.lesson16

class Cube(
    private val number: Int = (1..6).random()
) {
    fun printNumber() {
        println(number)
    }
}

fun main() {
    val cube1 = Cube()
    val cube2 = Cube()

    cube1.printNumber()
    cube2.printNumber()
}