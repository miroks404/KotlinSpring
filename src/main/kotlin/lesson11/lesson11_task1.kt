package org.example.lesson11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "miroks",
        password = "12345",
        email = "themiroks@gmail.com",
    )

    val user2 = User(
        id = 2,
        login = "apostol",
        password = "66908",
        email = "apostol@ya.ru"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}