package org.example.lesson21

fun main() {
    val listOfNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() : Int {
    var evenNumbersSum = 0
    for (i in this) {
        if (i % 2 == 0) {
            evenNumbersSum += i
        }
    }
    return evenNumbersSum
}