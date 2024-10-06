package org.example.lesson5

import java.time.LocalDate

import java.time.format.DateTimeFormatter
import kotlin.system.exitProcess


fun main() {
    print("Введите полную дату рождения (вводить через пробел (день месяц год)): ")
    try {
        val input = readln()
        val formatter = DateTimeFormatter.ofPattern("dd MM yyyy")
        val date = LocalDate.parse(input, formatter)
        val today = LocalDate.now()
        val dayOfBirthdayInThisYear = LocalDate.of(today.year, date.month, date.dayOfMonth)
        var age = today.year - date.year

        if (today < dayOfBirthdayInThisYear) age -= 1

        if (age < ADULT) println("Не показывать экран со скрытым контентом")
        else println("Показать экран со скрытым контентом")
        exitProcess(0)
    } catch (e: Exception) {
        println("Неверно введена дата")
    } finally {
        return main()
    }
}

const val ADULT = 18

// Добавил еще месяц и день чтобы проверить совершеннолетие более точно