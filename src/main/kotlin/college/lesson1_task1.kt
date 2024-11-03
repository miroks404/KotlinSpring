package org.example.college

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val (a, b, c) = try {
        print("Введите первую сторону треугольника: ")
        val a = readln().toDouble()

        print("Введите вторую сторону треугольника: ")
        val b = readln().toDouble()

        print("Введите третью сторону треугольника: ")
        val c = readln().toDouble()

        Triple(a, b, c)
    } catch (e: Exception) {
        println("Вводите только числа!")
        return
    }

    val isTriangleExists = isTriangleExists(a, b, c)

    if (!isTriangleExists) return

    val semiPerimeter = getSemiPerimeter(a, b, c)

    val area = getArea(a, b, c, semiPerimeter)

    val isIsoscelesTriangle = isIsoscelesTriangle(a, b, c)
    val isRightTriangle = isRightTriangle(a, b, c)

    val typeOfTriangle = if (isIsoscelesTriangle) ISOSCELES_TRIANGLE else if (isRightTriangle) RIGHT_TRIANGLE else
        VERSATILE_TRIANGLE

    println("Площадь $typeOfTriangle треугольника равна: ${"%.2f".format(area)} ")
}

fun isTriangleExists(a: Double, b: Double, c: Double): Boolean {
    if (a <= ZERO_VARIABLE || b <= ZERO_VARIABLE || c <= ZERO_VARIABLE) {
        println("У треугольника не может быть сторон <= 0")
        return false
    } else if (a + b <= c || a + c <= b || c + b <= a) {
        println("Сумма двух сторон СУЩЕСТВУЮЩЕГО треугольника должна быть больше третьей стороны")
        return false
    } else return true
}

fun isIsoscelesTriangle(a: Double, b: Double, c: Double): Boolean = a == b || b == c

fun isRightTriangle(a: Double, b: Double, c: Double): Boolean = a.pow(2.0) == b.pow(2.0) + c.pow(2.0) ||
        b.pow(2.0) == a.pow(2.0) + c.pow(2.0) || c.pow(2.0) == a.pow(2.0) + b.pow(2.0)

fun getSemiPerimeter(a: Double, b: Double, c: Double): Double = (a + b + c) / 2

fun getArea(a: Double, b: Double, c: Double, semiPerimeter: Double): Double =
    sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))


const val ZERO_VARIABLE: Double = 0.0
const val VERSATILE_TRIANGLE = "разностороннего"
const val ISOSCELES_TRIANGLE = "равнобедренного"
const val RIGHT_TRIANGLE = "прямоугольного"