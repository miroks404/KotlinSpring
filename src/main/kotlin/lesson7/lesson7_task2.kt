package org.example.lesson7

fun main() {
    do {
        val codeAuthorization = (1000..9999).random()

        println("Ваш код авторизации: $codeAuthorization")

        print("Введите код авторизации: ")
        val inputCode = readln().toInt()
    } while (codeAuthorization != inputCode)

    println("Вы вошли в систему!")
}