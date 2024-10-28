package org.example.lesson16

import kotlin.math.pow

private class Circle(
    private val radius: Double,
) {
    fun getCircumferenceLength() : Double = 2 * PI * radius

    fun getArea() : Double = PI * radius.pow(2)
}

fun main() {
    val circle1 = Circle(2.65)

    println("Длина окружности круга: ${circle1.getCircumferenceLength()}")
    println("Площадь круга: ${circle1.getArea()}")
}

private const val PI = 3.14