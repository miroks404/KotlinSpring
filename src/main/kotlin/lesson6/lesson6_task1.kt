package org.example.lesson6

fun main() {
    println("Вы выбрали регистрацию, придумайте логин и пароль: ")

    print("Логин: ")
    val registrLogin = readln()

    print("Пароль: ")
    val registrPassword = readln()

    do {
        println("Введите логин и пароль")

        print("Логин: ")
        val login = readln()

        print("Пароль: ")
        val password = readln()
    } while (registrLogin != login || registrPassword != password)

    println("Вы успешно прошли авторизацию")
}