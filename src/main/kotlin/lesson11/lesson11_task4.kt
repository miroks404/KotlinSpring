package org.example.lesson11

class DishCatergory(
    val listOfReciepts: MutableList<Reciept>,
)

class Reciept(
    val listOfIngredients: MutableList<Ingredients>,
)

class Ingredients(
    val ingredients: MutableList<String>,
    val quantity: MutableMap<String, String>,
)