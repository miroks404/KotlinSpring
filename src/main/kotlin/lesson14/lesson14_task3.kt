package org.example.lesson14

import java.lang.Math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun getArea(): Double

    abstract fun getPerimeter(): Float
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun getArea(): Double = PI * pow(radius, 2.0)
    override fun getPerimeter(): Float {
        TODO("Not yet implemented")
    }
}

class Rectangle(
    color: String,
    val width: Float,
    val length: Float,
) : Figure(color) {
    override fun getPerimeter(): Float = 2 * (width + length)

    override fun getArea(): Double {
        TODO("Not yet implemented")
    }
}

fun main() {
    val circle1 = Circle(WHITE_COLOR, 3.14)
    val circle2 = Circle(BLACK_COLOR, 5.0)
    val circle3 = Circle(WHITE_COLOR, 2.0)

    val rectangle1 = Rectangle(WHITE_COLOR, 10f, 3f)
    val rectangle2 = Rectangle(BLACK_COLOR, 8f, 5f)
    val rectangle3 = Rectangle(BLACK_COLOR, 11f, 8f)

    val listOfCircles = listOf(circle1, circle2, circle3)
    val listOfRectangles = listOf(rectangle1, rectangle2, rectangle3)

    var sumAreasOfWhiteCircles = 0.0
    var sumPerimetersOfBlackRectangles = 0f

    val allWhiteCircles = listOfCircles.filter { it.color == WHITE_COLOR }
    for (i in allWhiteCircles) sumAreasOfWhiteCircles += i.getArea()

    val allBlackRectangles = listOfRectangles.filter { it.color == BLACK_COLOR }
    for (i in allBlackRectangles) sumPerimetersOfBlackRectangles += i.getPerimeter()

    println("Сумма площадей всех белых фигур: $sumAreasOfWhiteCircles")
    println("Сумма периметров всех черных фигур: $sumPerimetersOfBlackRectangles")
}

const val PI = 3.14f
const val BLACK_COLOR = "Черный"
const val WHITE_COLOR = "Белый"