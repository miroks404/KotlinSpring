package org.example.lesson7

fun main() {
    print("Введите число: ")
    val inputNumber = readln().toInt()

    for(i in FIRST_RANGE_NUMBER..inputNumber step 2) {
        println(i)
    }
}

const val FIRST_RANGE_NUMBER = 0