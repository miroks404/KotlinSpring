package org.example.lesson15

interface FlyMovingMethod{
    fun flyingMovement()
}

interface SwimMovingMethod{
    fun swimmingMovement()
}

abstract class Beings : FlyMovingMethod, SwimMovingMethod {
    abstract val nameOfBeing: String
}

class Carp (
    override val nameOfBeing: String = "Карась",
) : Beings() {
    override fun swimmingMovement() {
        println("*плывет*")
    }

    override fun flyingMovement() {
        TODO("Not yet implemented")
    }
}

class Gull(
    override val nameOfBeing: String = "Чайка",
) : Beings() {
    override fun flyingMovement() {
        println("*летит*")
    }

    override fun swimmingMovement() {
        TODO("Not yet implemented")
    }
}

class Duck(
    override val nameOfBeing: String = "Утка"
) : Beings() {
    override fun swimmingMovement() {
        println("*плывет*")
    }

    override fun flyingMovement() {
        TODO("Not yet implemented")
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
}