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

        if (a == b || b == c) typeOfTriangle = "равнобедренного"
        else if (a.pow(2.0) == b.pow(2.0) + c.pow(2.0) || b.pow(2.0) == a.pow(2.0) + c.pow(2.0) ||
            c.pow(2.0) == a.pow(2.0) + b.pow(2.0)
        ) typeOfTriangle = "прямоугольного"
        else typeOfTriangle = "разностороннего"

        println("Площадь $typeOfTriangle треугольника равна: ${"%.2f".format(area)} ")

    } catch (e: Exception) {
        println("Вводите только числа!")
        System.exit(0)
    }
}

const val ZERO_VARIABLE: Double = 0.0