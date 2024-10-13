package org.example.lesson7

fun main() {
    var password = ""
    val passwordContect = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    print("Введите длину пароля (минимум 6 символов): ")
    val passwordLenght = readln().toInt()

    for (i in 1..6) {
        password += passwordContect.random()
    }
    for (i in MINIMUM_PASSWORD_LENGHT until passwordLenght) {
        password += passwordContect.random()
    }

    println(password)
}

const val MINIMUM_PASSWORD_LENGHT = 6