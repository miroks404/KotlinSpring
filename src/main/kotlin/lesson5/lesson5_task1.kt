package org.example.lesson5

fun main() {
    val firstNumber = 2
    val secondNumber = 2
    val captcha = "$firstNumber + $secondNumber"
    val rightAnswer = firstNumber + secondNumber

    print("Решите пример: $captcha = ")

    val answer = readln().toInt() // как я понял это ненулевой приемник и ненулевой утверждение (!!) можно не писать

    if (answer == rightAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}
