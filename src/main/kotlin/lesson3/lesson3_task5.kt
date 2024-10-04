package org.example.lesson3

fun main() {
    val move = "D2-D4;0"
    val parse = move.split("-", ";")
    val where = parse[WHERE_INDEX]
    val from = parse[FROM_INDEX]
    val moveNumber = parse[MOVE_NUMBER_INDEX]

    println(
        """
        откуда: $where
        куда: $from
        номер хода: $moveNumber
    """.trimIndent()
    )
}

const val WHERE_INDEX = 0
const val FROM_INDEX = 1
const val MOVE_NUMBER_INDEX = 2
