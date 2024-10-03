package org.example.lesson3

fun main() {
    var where = "E2"
    var whereIndex = where[NUMBER].digitToInt()
    var move = 2
    move += whereIndex
    var from = where[LETTER] + move.toString()
    var moveNumber = 1

    println("$where-$from;$moveNumber")

    where = "D2"
    whereIndex = where[NUMBER].digitToInt()
    move = 1
    move += whereIndex
    from = where[LETTER] + move.toString()
    moveNumber++

    println("$where-$from;$moveNumber")
}

const val LETTER = 0
const val NUMBER = 1