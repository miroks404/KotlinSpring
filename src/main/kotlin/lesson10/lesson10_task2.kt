package org.example.lesson10

fun main() {
    print("Введите логин: ")
    val inputLogin = readln()

    print("Введите пароль: ")
    val inputPassword = readln()

    println(checkValidString(inputLogin, inputPassword))
}

fun checkValidString(inputLogin: String, inputPassword: String): String = if
        (inputLogin.length < MINIMUM_LENGTH || inputPassword.length < MINIMUM_LENGTH)
        { "Логин или пароль недостаточно длинные" } else "Добро пожаловать в систему!"

const val MINIMUM_LENGTH = 4