package org.example.lesson13

class TelephoneBook(
    val name: String,
    val number: Long,
    val company: String? = null,
){
    fun printBook() = println("- Имя: $name\n- Номер: $number\n- Компания: ${company?:"не указано"}")
}

fun main() {
    val newContact = TelephoneBook("Саша", 79654221256)
    newContact.printBook()
}