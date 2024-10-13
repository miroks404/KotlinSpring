package org.example.lesson7

fun main() {
    print("Введите число: ")
    val inputNumber = readln().toInt()

    val range = FIRST_EVEN_NUMBER..inputNumber step 2

    for(i in range) {
        println(i)
    }
}

const val FIRST_EVEN_NUMBER = 2