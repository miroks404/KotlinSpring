package org.example.lesson9

fun main() {
    val listOfIngredients = listOf("мясо", "рыба", "хлеб", "овощи")

    println("В рецепте есть следующие ингредиенты: ")

    for (i in listOfIngredients) {
        println(i)
    }
}
