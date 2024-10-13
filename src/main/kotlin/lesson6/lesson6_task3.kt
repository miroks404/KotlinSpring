package org.example.lesson6

fun main() {
    print("Количество секунд которых нужно засечь: ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}