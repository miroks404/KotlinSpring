package org.example.lesson8

fun main() {
    var arrayOfIngredients: Array<String> = arrayOf()

    print("Сколько ингредиентов вы впишете? ")
    val sizeOfArray = readln().toInt()

    var indexArray = 0
    for (i in 1..sizeOfArray) {
        arrayOfIngredients += ""
    }
    for (i in 1..sizeOfArray) {
        print("Впишите название ингредиента: ")
        val ingredient = readln()
        arrayOfIngredients[i - 1] = ingredient
    }
    for (i in arrayOfIngredients) {
        indexArray++
        if (indexArray == sizeOfArray) { // это сделано чтобы убрать последнюю ненужную ","
            print(i)
            break
        }
        print("$i, ")
    }
}