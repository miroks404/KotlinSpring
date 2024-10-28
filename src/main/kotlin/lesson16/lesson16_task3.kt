package org.example.lesson16

private class User (
    val login: String,
    private val password: String,
){
    fun validationPassword(inputPassword: String) : Boolean = inputPassword == password
}

fun main() {
    val user1 = User("miroks404", "123U5")

    println(user1.login)
    println("Введен ли верно пароль? ${user1.validationPassword("123U5")}")
}