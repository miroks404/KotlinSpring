package org.example.lesson6

fun main() {
    val hiddenNumber = (1..9).random()
    var attempt = 0
    do {
        print("Угадайте число $GUESSING_RANGE: ")
        val tryNumber = readln().toInt()

        if (hiddenNumber != tryNumber) {
            attempt++
            println("Неверно (число оставшихся попыток: ${NUMBER_OF_ATTEMPTS - attempt})")
            if (attempt == 5) {
                println("Было загадано число $hiddenNumber")
                return
            }
        }
    } while (hiddenNumber != tryNumber)

    println("Это была великолепная игра!")
}

const val NUMBER_OF_ATTEMPTS = 5
const val GUESSING_RANGE = "(от 1 до 9)"