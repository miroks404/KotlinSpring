package org.example.lesson8

fun main() {
    val arrayOfIngredients = arrayOf("курица", "яйца", "молоко", "хлеб")

    print("Введите название ингредиента: ")
    val inputIngredient = readln()

    for (i in arrayOfIngredients){
        if (i == inputIngredient) {
            println("Ингредиент $inputIngredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}