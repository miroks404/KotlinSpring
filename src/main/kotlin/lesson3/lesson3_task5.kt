package org.example.lesson3

fun main() {
    val move = "D2-D4;0"
    val parse = move.split("-", ";")
    val where = parse[WHERE]
    val from = parse[FROM]
    val moveNumber = parse[MOVE_NUMBER]

    println(
        """
        откуда: $where
        куда: $from
        номер хода: $moveNumber
    """.trimIndent()
    )
}

const val WHERE = 0
const val FROM = 1
const val MOVE_NUMBER = 2
