package org.example.lesson17

private class User(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            field = value
            println("Успешно изменен логин!")
        }

    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете поменять пароль!")
        }
}

fun main() {
    val user1 = User("miroks404", "U1237")

    user1.login = "zhenya"

    println(user1.login)

    println(user1.password)

    user1.password = "123"

    println(user1.password)
}