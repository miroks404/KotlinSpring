package org.example.lesson8

fun main() {
    var arrayOfIngredients: Array<String> = arrayOf()

    print("Сколько ингредиентов вы впишете? ")
    val sizeOfArray = readln().toInt()

    for (i in 1..sizeOfArray) {
        arrayOfIngredients += ""
    }
    for (i in 1..sizeOfArray) {
        print("Впишите название ингредиента: ")
        val ingredient = readln()
        arrayOfIngredients[i - 1] = ingredient
    }

    println(arrayOfIngredients.joinToString(", "))
}