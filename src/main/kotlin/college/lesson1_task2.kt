package org.example.college

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    try { // Хотел написать только блок с readln, но эти переменные стали локальными, пришлось растянуть на весь код чтобы я мог пользоваться переменными a,b,c

        print("Введите первую сторону треугольника: ")
        val a = readln().toDouble()

        print("Введите вторую сторону треугольника: ")
        val b = readln().toDouble()

        print("Введите третью сторону треугольника: ")
        val c = readln().toDouble()

        if (a <= ZERO_VARIABLE || b <= ZERO_VARIABLE || c <= ZERO_VARIABLE) {
            println("У треугольника не может быть сторон <= 0")
            System.exit(0)
        }

        if (a + b <= c || a + c <= b || c + b <= a) {
            println("Сумма двух сторон СУЩЕСТВУЮЩЕГО треугольника должна быть больше третьей стороны")
            System.exit(0)
        }

        val semiperimeter = (a + b + c) / 2

        val area = sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c))

        val typeOfTriangle: String

        val largestSide = maxOf(a, b, c)
        var firstSide = 0.0
        var secondSide = 0.0

        if (largestSide == a && largestSide == b && largestSide == c){ // Определяю оставшиеся стороны
            println("Площадь остроугольного треугольника равна: ${"%.2f".format(area)}")
            System.exit(0)
        } else if (largestSide == a) {
            firstSide = b
            secondSide = c
        } else if (largestSide == b) {
            firstSide = a
            secondSide = c
        } else if (largestSide == c) {
            firstSide = a
            secondSide = b
        }


        if (largestSide.pow(2.0) == firstSide.pow(2.0) + secondSide.pow(2.0)) typeOfTriangle = "прямоугольного"
        else if (largestSide.pow(2.0) > firstSide.pow(2.0) + secondSide.pow(2.0))
            typeOfTriangle = "тупоугольного"
        else typeOfTriangle = "остроугольного"

        println("Площадь $typeOfTriangle треугольника равна: ${"%.2f".format(area)}")

    } catch (e: Exception) {
        println("Вводите только числа!")
        System.exit(0)
    }
}

const val ZERO_VARIABLE: Double = 0.0