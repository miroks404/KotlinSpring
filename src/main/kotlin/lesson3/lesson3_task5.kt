package org.example.lesson3

fun main() {
    val move = "D2-D4;0"
    val whereLetter = move[WHERE_LETTER]
    val whereNumber = move[WHERE_NUMBER].toString()
    val fromLetter = move[FROM_LETTER]
    val fromNumber = move[FROM_NUMBER].toString()
    val moveNumber = move[MOVE_NUMBER]
    val where = whereLetter + whereNumber
    val from = fromLetter + fromNumber

    println(
        """
        откуда: $where
        куда: $from
        номер хода: $moveNumber
    """.trimIndent()
    )
}

const val WHERE_LETTER = 0
const val WHERE_NUMBER = 1
const val FROM_LETTER = 3
const val FROM_NUMBER = 4
const val MOVE_NUMBER = 6
