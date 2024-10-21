package org.example.lesson13

import kotlin.system.exitProcess

class PhoneBook(
    val listOfContacts: MutableList<Contact> = mutableListOf()
) {
    fun createNewContact() {
        print("Введите имя контакта: ")
        val inputName = readln()
        print("Введите номер контакта: ")
        val inputNumber = readLine()
        print("Введите компанию контака (не обязательно): ")
        val inputCompany = readLine()

        val newContact = Contact(inputName, inputNumber, inputCompany)

        listOfContacts.add(newContact)
    }

    fun printAllList() {
        for (i in listOfContacts){
            println("""
                - Имя: ${i.name}
                - Номер: ${i.number}
                - Компания: ${i.company}""".trimIndent())
        }
    }
}

class Contact(
    val name: String,
    val number: String?,
    val company: String? = null,
){
    init {
        if (number == null || number == ""){
            println("Вы не ввели номер телефона")
            exitProcess(0)
        }
        if (company == "") company == null
    }

}

fun main() {
    val phoneBook = PhoneBook()
    val contact1 = phoneBook.createNewContact()
    val contact2 = phoneBook.createNewContact()
    val contact3 = phoneBook.createNewContact()

    phoneBook.printAllList()

}
