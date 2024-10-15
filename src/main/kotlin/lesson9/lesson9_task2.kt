package org.example.lesson9

fun main() {
    val mutableListOfIngredients = mutableListOf("хлеб", "овощи", "вода")

    println("В рецепте есть базовые ингредиенты: ${mutableListOfIngredients.joinToString(", ")} ")

    print("Желаете добавить еще? (да/нет) ")
    val inputChoice = readln()

    if (inputChoice == "нет") return

    print("Какой ингредиент вы хотите добавить? ")
    val inputIngredient = readln()

    mutableListOfIngredients.add(inputIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: ${mutableListOfIngredients.joinToString(", ")} ")
}