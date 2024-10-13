package org.example.lesson6

import kotlin.random.Random

fun main() {
    var attempts = 0
    do {
        attempts++
        val firstNumber = Random.nextInt(1, 9)
        val secondNumber = Random.nextInt(1, 9)
        val correctAnswer = firstNumber + secondNumber

        print("Решите пример: $firstNumber + $secondNumber = ")
        val answer = readln().toInt()

        if (attempts == 3) {
            println("Доступ запрещен")
            return
        }
    } while (correctAnswer != answer)

    println("Добро пожаловать!")
}