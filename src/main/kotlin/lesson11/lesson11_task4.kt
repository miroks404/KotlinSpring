package org.example.lesson11

class DishCatergory(
    val listOfCategories: MutableList<String> = mutableListOf("Бургеры", "Десерты", "Пицца", "Рыба", "Супы", "Салаты"),
)

class Reciept(
    val reciepts: MutableList<String>,
)

class Ingredients(
    val ingredients: MutableList<String>,
    val quantity: MutableMap<String, String>,
)