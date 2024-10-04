package org.example.lesson3

fun main() {
    val number = 8
    println(
        """
        $number x 1 = ${number * ONE}
        $number x 2 = ${number * TWO}
        $number x 3 = ${number * THREE}
        $number x 4 = ${number * FOUR}
        $number x 5 = ${number * FIVE}
        $number x 6 = ${number * SIX}
        $number x 7 = ${number * SEVEN}
        $number x 8 = ${number * EIGHT}
        $number x 9 = ${number * NINE}
    """.trimIndent()
    )
}

const val ONE: Byte = 1
const val TWO: Byte = 2
const val THREE: Byte = 3
const val FOUR: Byte = 4
const val FIVE: Byte = 5
const val SIX: Byte = 6
const val SEVEN: Byte = 7
const val EIGHT: Byte = 8
const val NINE: Byte = 9