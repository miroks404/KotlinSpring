package org.example.lesson8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "масло", "хлеб", "вода", "зелень")

    for (i in arrayOfIngredients) {
        println("Ингридиент №${arrayOfIngredients.indexOf(i) + 1}: $i")
    }

    print("Какой ингредиент вы хотите заменить (писать номер ингрудиента)? ")
    val replaceTheIngredient = readln().toInt()

    if (replaceTheIngredient >= arrayOfIngredients.size + 1 || replaceTheIngredient < 1) {
        println("Такого ингредиента нет в списке!")
        return
    }

    print("На что хотите заменить? ")
    val newIngredient = readln()

    arrayOfIngredients[replaceTheIngredient - 1] = newIngredient

    println("Новый список ингредиентов")
    for (i in arrayOfIngredients) {
        println("Ингридиент №${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}