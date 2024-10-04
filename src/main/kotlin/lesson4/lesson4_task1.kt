package org.example.lesson4

fun main() {
    val bookedToday: Short = 13
    val bookedTomorrow: Short = 9
    val allTables: Short = 13

    println("Доступность столиков на сегодня: ${bookedToday !== allTables} ")
    println("Доступность столиков на завтра: ${bookedTomorrow !== allTables}")
}