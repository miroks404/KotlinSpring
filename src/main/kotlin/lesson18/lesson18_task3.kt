package org.example.lesson18

private abstract class Animals (
    protected val name: String,
) {
    abstract fun getEat() : String
    fun sleep() {
        println("$name спит...")
    }
}

private class Fox(
    name: String,
) : Animals(name) {
    override fun getEat(): String = "$name -> ест ягоды"
}

private class Dog(
    name: String,
) : Animals(name) {
    override fun getEat(): String = "$name -> грызет кость"
}

private class Cat(
    name: String,
) : Animals(name) {
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

    animal1.sleep()
}
