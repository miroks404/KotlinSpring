package org.example.lesson19



enum class Fish(val id: Int) {
    GUPPY(1),
    ANGELFISH(2),
    GOLDFISH(3),
    SIAMESE_FIGHTING_FISH(4);
}

fun getFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> print("Гуппи, ")
        Fish.ANGELFISH -> print("Скалярия, ")
        Fish.GOLDFISH -> print("Золотая рыбка, ")
        Fish.SIAMESE_FIGHTING_FISH -> print("Петушок ")
    }
}

fun main() {
    val listOfFishes = listOf(1,2,3,4)

    print("Вы можете добавить в свой аквариум только данных рыбок: ")

    for (i in listOfFishes) {
        when (i) {
            Fish.GUPPY.id -> getFish(Fish.GUPPY)
            Fish.ANGELFISH.id -> getFish(Fish.ANGELFISH)
            Fish.GOLDFISH.id -> getFish(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.id -> getFish(Fish.SIAMESE_FIGHTING_FISH)
        }
    }
}