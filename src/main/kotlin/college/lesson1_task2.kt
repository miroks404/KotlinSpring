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

    if (a == b && b == c) {
        println("Площадь остроугольного треугольника равна: ${"%.2f".format(area)}")
        System.exit(0)
    }

    val largestSide = maxOf(a, b, c)
    val (firstSide, secondSide) = when (largestSide) {
        a -> b to c
        b -> a to c
        else -> a to b
    }

    val typeOfTriangle = checkTriangleType(largestSide, firstSide, secondSide)

    println("Площадь $typeOfTriangle треугольника равна: ${"%.2f".format(area)}")

}

fun isTriangleExists(a: Double, b: Double, c: Double): Boolean {
    if (a <= 0 || b <= 0 || c <= 0) {
        println("У треугольника не может быть сторон <= 0")
        return false
    } else if (a + b <= c || a + c <= b || c + b <= a) {
        println("Сумма двух сторон СУЩЕСТВУЮЩЕГО треугольника должна быть больше третьей стороны")
        return false
    } else return true
}

fun getSemiPerimeter(a: Double, b: Double, c: Double): Double = (a + b + c) / 2

fun getArea(a: Double, b: Double, c: Double, semiPerimeter: Double): Double =
    sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))

fun checkTriangleType(largestSide: Double, firstSide: Double, secondSide: Double): String =
    if (largestSide.pow(2.0) == firstSide.pow(2.0) + secondSide.pow(2.0)) "прямоугольного"
    else if (largestSide.pow(2.0) > firstSide.pow(2.0) + secondSide.pow(2.0)) "тупоугольного"
    else "остроугольного"
