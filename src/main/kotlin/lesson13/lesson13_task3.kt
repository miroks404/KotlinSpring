package org.example.lesson13

class PhoneBook(
    val name: String,
    val number: Long,
    val company: String? = null,

)

fun main() {
    val listOfPhoneBook = mutableListOf(PhoneBook("Саша", 79654221256),
        PhoneBook("Петя", 75443212345, "null"),
        PhoneBook("Георгий", 78554345677, "СОГАЗ"),
        PhoneBook("Евгений", 78656908765, "ЛУКОЙЛ"),
        PhoneBook("Денис", 78990908990)
    )

    for (i in listOfPhoneBook) {
        if (i.company != null) println(i.company)
    }
}