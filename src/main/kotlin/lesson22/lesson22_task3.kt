package org.example.lesson22

private data class User(
    val username: String,
    val login: String,
    val password: String,
)

fun main() {
    val user = User("miroks404", "miroks", "12345")

    val (userUsername, userLogin, userPassword) = user

    println(userUsername)
    println(userLogin)
    println(userPassword)
}