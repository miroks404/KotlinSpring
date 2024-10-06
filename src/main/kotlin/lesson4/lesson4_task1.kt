package org.example.lesson4

fun main() {
    val bookedToday: Short = 13
    val bookedTomorrow: Short = 9

    println("Доступность столиков на сегодня: ${bookedToday < ALL_TABLES} ")
    println("Доступность столиков на завтра: ${bookedTomorrow < ALL_TABLES}")
}

const val ALL_TABLES: Short = 13