package org.example.college

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val (a, b, c) = try { // Использовал это, потому что если взять с null типами, то очень тяжело потом делать сравнения
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

    val isRightTriangle = if (a <= ZERO_VARIABLE || b <= ZERO_VARIABLE || c <= ZERO_VARIABLE) {
        println("У треугольника не может быть сторон <= 0")
        false
    } else if (a + b <= c || a + c <= b || c + b <= a) {
        println("Сумма двух сторон СУЩЕСТВУЮЩЕГО треугольника должна быть больше третьей стороны")
        false
    } else true

    if (!isRightTriangle) {
        return
    }

    val semiPerimeter = (a + b + c) / 2

    val area = sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))

    val typeOfTriangle = when {
        a == b || b == c -> ISOSCELES_TRIANGLE
        a.pow(2.0) == b.pow(2.0) + c.pow(2.0) ||
                b.pow(2.0) == a.pow(2.0) + c.pow(2.0) || c.pow(2.0) == a.pow(2.0) + b.pow(2.0) ->
            RIGHT_TRIANGLE

        else -> VERSATILE_TRIANGLE
    }

    println("Площадь $typeOfTriangle треугольника равна: ${"%.2f".format(area)} ")
}

const val ZERO_VARIABLE: Double = 0.0
const val VERSATILE_TRIANGLE = "разостороннего"
const val ISOSCELES_TRIANGLE = "равнобедренного"
const val RIGHT_TRIANGLE = "прямоугольного"