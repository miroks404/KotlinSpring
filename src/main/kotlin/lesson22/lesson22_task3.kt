package org.example.lesson22

private data class User(
    val username: String,
    val login: String,
    val password: String,
)

fun main() {
    val user = User("miroks404", "miroks", "12345")

    val userUsername = user.username
    val userLogin = user.login
    val userPassword = user.password

    println(userUsername)
    println(userLogin)
    println(userPassword)
}