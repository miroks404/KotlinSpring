package org.example.lesson8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "масло", "хлеб", "вода", "зелень")

    for (i in arrayOfIngredients) {
        println("Ингридиент №${arrayOfIngredients.indexOf(i) + 1}: $i")
    }

    print("Какой ингредиент вы хотите заменить? ")
    val replaceTheIngredient = readln()

    val indexReplaceTheIngredient = arrayOfIngredients.indexOf(replaceTheIngredient)

    if (indexReplaceTheIngredient == -1) {
        println("Такого ингредиента нет в списке")
        return
    }

    print("На что хотите заменить? ")
    val newIngredient = readln()

    arrayOfIngredients[indexReplaceTheIngredient] = newIngredient

    println("Новый список ингредиентов")
    for (i in arrayOfIngredients) {
        println("Ингридиент №${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}