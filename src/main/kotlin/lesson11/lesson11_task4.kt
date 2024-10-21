package org.example.lesson11

class DishCategory(
    val imageUrl: String,
    val header: String = "Категории",
    val listOfReciepts: MutableList<Recipe>,
    val listOfDescriptionsOfReciepts: MutableMap<Recipe, String>,
)

class Recipe(
    val imageUrl: String,
    val header: String,
    val methodsOfCooking: MutableList<String>,
    val listOfIngredients: MutableList<Ingredient>,
)

class Ingredient(
    val ingredients: MutableList<String>,
    val quantity: MutableMap<String, String>,
)