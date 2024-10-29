package org.example.lesson18

private abstract class Dice {
    open fun getDice() {}
}

private class Dice4 : Dice() {
    override fun getDice() {
        val droppedNumber = (1..4).random()
        println(droppedNumber)
    }
}

private class Dice6 : Dice() {
    override fun getDice() {
        val droppedNumber = (1..6).random()
        println(droppedNumber)
    }
}

private class Dice8 : Dice() {
    override fun getDice() {
        val droppedNumber = (1..8).random()
        println(droppedNumber)
    }
}

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()

    val arrayOfDices: Array<Dice> = arrayOf(dice1, dice2, dice3)

    arrayOfDices.forEach {
        it.getDice()
    }
}