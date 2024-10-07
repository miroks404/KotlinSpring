package org.example.lesson5

import kotlin.random.Random

fun main() {
    val randomNumbers = List(3) { Random.nextInt(0, 42) }

    print("Введите первое число (от 0 до 42): ")
    val firstNumber = readln().toInt()

    print("Введите второе число (от 0 до 42): ")
    val secondNumber = readln().toInt()

    print("Введите третье число (от 0 до 42): ")
    val thirdNumber = readln().toInt()

    val inputNumbers = listOf(firstNumber, secondNumber, thirdNumber)

    val guessedNumbers = (randomNumbers intersect inputNumbers).count()

    when (guessedNumbers) {
        1 -> println("Вы угадали одно число! Вы выиграли утешительный приз")
        2 -> println("Вы угадали два числа! Вы выиграли крупный приз")
        3 -> println("Вы угадали все числа! Вы выиграли джекпот")
        else -> println("Вы не угадали ни одного числа :(")
    }

    println("Загаданные числа: ${randomNumbers.joinToString(", ")}")
}