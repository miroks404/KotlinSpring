package org.example.lesson18

private abstract class Animals {
    abstract fun getEat() : String
    open fun sleep() {}
}

private class Fox(
    private val name: String,
) : Animals() {
    override fun getEat(): String = "$name -> ест ягоды"
}

private class Dog(
    private val name: String,
) : Animals() {
    override fun getEat(): String = "$name -> грызет кость"
}

private class Cat(
    private val name: String,
) : Animals() {
    override fun getEat(): String = "$name -> ест рыбу"
}

fun main() {
    val animal1 = Fox("Кристина")
    val animal2 = Dog("Алена")
    val animal3 = Cat("Оля")

    val listOfAnimals: List<Animals> = listOf(animal1, animal2, animal3)

    for (i in listOfAnimals) {
        println(i.getEat())
    }
}
