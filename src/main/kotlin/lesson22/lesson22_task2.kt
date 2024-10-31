package org.example.lesson22

private class RegularBook(
    val name: String,
    val author: String,
)

private data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook("Я и ты", "Онегин")
    val book2 = DataBook("Мертвые души", "Гоголь")

    println(book1) // В обычном классе нет переопределения toString и поэтому будет выводиться название класса с hashcode
    println(book2) // В дата классе уже переопределена функция toString и поэтому она выводит нормализованную информацию, но при надобности мы ее можем и в свой вывод переопределить (как и в обычной функции)
}