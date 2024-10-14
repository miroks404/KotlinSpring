package org.example.lesson7


fun main() {
    val listOfPassword = mutableListOf<Char>()
    val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    listOfPassword.add(allChars.random())
    listOfPassword.add(allChars.random())
    listOfPassword.add(allChars.random())

    print("Введите длину пароля (минимум 6 символов): ")
    val passwordLenght = readln().toInt()

    for (i in 4..passwordLenght) {
        listOfPassword.add(allChars.random())
    }

    listOfPassword.shuffle()

    val password = listOfPassword.joinToString("")

    println(password)
}
