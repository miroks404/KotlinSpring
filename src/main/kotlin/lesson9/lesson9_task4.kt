package org.example.lesson9

fun main() {
    print("Перечислите 5 ингредиентов, которые хотите добавить в список: ")
    val inputIngredients = readln()

    val listOfIngredients = inputIngredients.split(", ")

    val sortedListOfIngredients = listOfIngredients.sorted()

    println(sortedListOfIngredients)
}