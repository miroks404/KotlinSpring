package org.example.lesson15

interface FlyMovingMethod {
    fun flyingMovement()
}

interface SwimMovingMethod {
    fun swimmingMovement()
}

abstract class Beings {
    abstract val nameOfBeing: String
}

class Carp(
    override val nameOfBeing: String = "Карась",
) : Beings(), SwimMovingMethod {
    override fun swimmingMovement() {
        println("*плывет*")
    }
}

class Gull(
    override val nameOfBeing: String = "Чайка",
) : Beings(), FlyMovingMethod {
    override fun flyingMovement() {
        println("*летит*")
    }
}

class Duck(
    override val nameOfBeing: String = "Утка"
) : Beings(), SwimMovingMethod, FlyMovingMethod {
    override fun swimmingMovement() {
        println("*плывет*")
    }

    override fun flyingMovement() {
        println("*летит*")
    }

}

fun main() {
    val being1 = Carp()
    val being2 = Gull()
    val being3 = Duck()

    print("Карась: ")
    being1.swimmingMovement()

    print("Чайка: ")
    being2.flyingMovement()

    print("Утка: ")
    being3.swimmingMovement()
    print("Утка: ")
    being3.flyingMovement()
}