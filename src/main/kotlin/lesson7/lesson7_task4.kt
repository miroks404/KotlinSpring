package org.example.lesson7

fun main() {
    print("Сколько секунд нужно засечь? ")
    val timeBefore = readln().toInt()

    for (i in timeBefore downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}