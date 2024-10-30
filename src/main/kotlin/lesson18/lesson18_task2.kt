package org.example.lesson18

private abstract class Dice {

    abstract val numberOfFaces: Int

    open fun printDice() {}
}

private class Dice4 : Dice() {

    override val numberOfFaces: Int
        get() = 4

    override fun printDice() {
        val droppedNumber = (1..numberOfFaces).random()
        println(droppedNumber)
    }
}

private class Dice6 : Dice() {

    override val numberOfFaces: Int
        get() = 6

    override fun printDice() {
        val droppedNumber = (1..numberOfFaces).random()
        println(droppedNumber)
    }
}

private class Dice8 : Dice() {

    override val numberOfFaces: Int
        get() = 8

    override fun printDice() {
        val droppedNumber = (1..numberOfFaces).random()
        println(droppedNumber)
    }
}

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()

    val arrayOfDices: Array<Dice> = arrayOf(dice1, dice2, dice3)

    arrayOfDices.forEach {
        it.printDice()
    }
}