package org.example.lesson3

fun main() {
    var where = "E2"
    var whereIndex = where[1].digitToInt()
    var move = 2
    move += whereIndex
    var from = where[0] + move.toString()
    var moveNumber = 1

    println("$where-$from;$moveNumber")

    where = "D2"
    whereIndex = where[1].digitToInt()
    move = 1
    move += whereIndex
    from = where[0] + move.toString()
    moveNumber++

    println("$where-$from;$moveNumber")
}
