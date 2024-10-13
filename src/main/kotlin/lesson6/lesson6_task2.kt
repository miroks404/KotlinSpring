package org.example.lesson6

fun main() {
    print("Количество секунд которых нужно засечь: ")
    var seconds = readln().toInt()
    val givenSeconds = seconds

    while (seconds > 0) {
        seconds--
        Thread.sleep(1000)
    }

    println("Прошло $givenSeconds секунд")
}