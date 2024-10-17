package org.example.lesson9

fun main() {
    val listOfIngredients: MutableSet<String> = mutableSetOf()

    print("Напишите название первого ингрудиента: ")
    val firstIngredient = readln()
    listOfIngredients.add(firstIngredient)

    print("Напишите название второго ингредиента: ")
    val secondIngredient = readln()
    listOfIngredients.add(secondIngredient)

    print("Напишите название третьего ингредиента: ")
    val thirdIngredient = readln()
    listOfIngredients.add(thirdIngredient)

    print("Напишите название четвертого ингредиента: ")
    val fourthIngredient = readln()
    listOfIngredients.add(fourthIngredient)

    print("Напишите название пятого ингредиента: ")
    val fiftyIngredient = readln()
    listOfIngredients.add(fiftyIngredient)

    val sortedListOfIngredients = listOfIngredients.sorted().joinToString(", ")

    println(sortedListOfIngredients.replaceFirstChar { sortedListOfIngredients[0].uppercaseChar() })
}