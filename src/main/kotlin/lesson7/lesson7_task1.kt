package org.example.lesson7

fun main() {
    val letters = "abcdefghijklmnopqrstuvwxyz"
    val numbers = "0123456789"
    var password = ""

    for (i in 1..3) {
        password += letters.random()
        password += numbers.random()
    }

    println(password)
}