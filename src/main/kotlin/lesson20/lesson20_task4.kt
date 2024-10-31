package org.example.lesson20

fun main() {
    val listOfElements: List<String> = listOf("Кнопка1", "Кнопка2", "Кнопка3", "Кнопка4")

    val lambdasOfElements = listOfElements.map { element: String -> "Нажата кнопка $element" }


    for (i in 1..lambdasOfElements.size step 2) {
        println(lambdasOfElements[i])
    }

}
