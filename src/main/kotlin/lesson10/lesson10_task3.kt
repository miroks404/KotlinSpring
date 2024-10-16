package org.example.lesson10

fun main() {
    print("Задайте длину пароля: ")
    val inputLongOfPassword = readln().toInt()

    println(generationPassword(inputLongOfPassword))
}

fun generationPassword(inputLongOfPassword: Int): String {
    val specialCharacters = listOf('!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    val numbers = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

    val listOfPassword = mutableListOf<Char>()
    for (i in 1..inputLongOfPassword step 2) {
        listOfPassword.add(numbers.random())
        listOfPassword.add(specialCharacters.random())
    }

    if (inputLongOfPassword % 2 != 0) listOfPassword.removeLast()

    val password = listOfPassword.joinToString("")

    return password
}