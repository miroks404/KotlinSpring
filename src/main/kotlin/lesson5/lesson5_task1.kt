package org.example.lesson5

fun main() {
    val captcha = "2 + 2"

    print("Решите пример: $captcha = ")

    val answer = readln() // как я понял это ненулевой приемник и ненулевой утверждение (!!) можно не писать

    if (answer == RIGHT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}

const val RIGHT_ANSWER = "4"