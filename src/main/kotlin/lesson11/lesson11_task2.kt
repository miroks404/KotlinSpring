package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?,
) {
    fun outputInformation() {
        println(
            """
            айди: $id
            логин: $login
            пароль: $password
            эмейл: $email
            о себе: ${bio ?: "Нет информации"}
        """.trimIndent()
        )
    }

    fun addBio() {
        print("Напишите о себе: ")
        val outputBio = readlnOrNull()
        bio = outputBio
    }

    fun changePassword() {
        print("Напишите старый пароль: ")
        val oldPassword = readln()
        if (oldPassword == password) {
            print("Напишите новый пароль: ")
            val newPassword = readln()
            password = newPassword
        } else println("Старый пароль не верен")
    }
}

fun main() {
    val user1 = User2(
        id = 1,
        login = "oleg",
        password = "1236",
        email = "oleg@ya.ru",
        bio = null
    )

    println("Добавляем информацию о себе")
    user1.addBio()

    println("Меняем пароль")
    user1.changePassword()

    println("Выводим всю информацию")
    user1.outputInformation()
}