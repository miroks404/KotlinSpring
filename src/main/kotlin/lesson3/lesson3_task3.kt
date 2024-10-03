package org.example.lesson3

fun main() {
    val number = 8
    println(
        """
        $number x 1 = ${number * one}
        $number x 2 = ${number * two}
        $number x 3 = ${number * three}
        $number x 4 = ${number * four}
        $number x 5 = ${number * five}
        $number x 6 = ${number * six}
        $number x 7 = ${number * seven}
        $number x 8 = ${number * eight}
        $number x 9 = ${number * nine}
    """.trimIndent()
    )
}

const val one: Byte = 1
const val two: Byte = 2
const val three: Byte = 3
const val four: Byte = 4
const val five: Byte = 5
const val six: Byte = 6
const val seven: Byte = 7
const val eight: Byte = 8
const val nine: Byte = 9