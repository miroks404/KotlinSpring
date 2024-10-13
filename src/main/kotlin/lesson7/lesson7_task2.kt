package org.example.lesson7

import kotlin.random.Random

fun main() {
    do {
        val codeAuthorization = Random.nextInt(1000, 9999)

        println("Ваш код авторизации: $codeAuthorization")

        print("Введите код авторизации: ")
        val inputCode = readln().toInt()
    } while (codeAuthorization != inputCode)

    println("Вы вошли в систему!")
}