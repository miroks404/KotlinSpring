package org.example.lesson22

private class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook("Я и не я", "Онегин")
    val book2 = RegularBook("Ты и не ты", "Пушкин")
    val book11 = RegularBook("Я и не я", "Онегин")

    val book3 = DataBook("Мертвые души", "Гоголь")
    val book4 = DataBook("Акакий", "Гоголь")
    val book5 = DataBook("Мертвые души", "Гоголь")

    println(book1 == book2)
    println(book1 == book11) //Сравнивает ссылки на ячейки памяти (т.к просто class)

    println()

    println(book3.hashCode() == book4.hashCode())
    println(book3.hashCode() == book5.hashCode()) // Сравнивает данные в классе (использовали hashcode для оптимизации, т.к сравниваются числа (hashcode преобразует дата классы в числа и если данные в дата классах равны то и значения hashcode тоже будут равны))
}