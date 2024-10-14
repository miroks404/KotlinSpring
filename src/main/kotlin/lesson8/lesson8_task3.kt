package org.example.lesson8

fun main() {
    val arrayOfIngredients = arrayOf("курица", "яйца", "молоко", "хлеб")

    print("Введите название ингредиента: ")
    val inputIngredient = readln()

    val isContains = arrayOfIngredients.contains(inputIngredient)

    if (isContains) println("Ингредиент $inputIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}