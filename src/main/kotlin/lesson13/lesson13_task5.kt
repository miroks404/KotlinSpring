package org.example.lesson13

import kotlin.system.exitProcess

class Contact(
    val name: String,
    val number: String,
    val company: String? = null,
    ) {

    init {
        try {
            number.toLong()
        } catch (e: Exception) {
            println("Вы ввели недопустимый номер телефона")
            exitProcess(0)
        }
    }

}

fun main() {
    print("Введите имя контакта: ")
    val inputName = readln()
    print("Введите номер контакта: ")
    val inputNumber = readln()
    print("Введите компанию контака (не обязательно): ")
    val inputCompany = readLine()

    val contact1 = Contact(inputName, inputNumber, inputCompany)
}