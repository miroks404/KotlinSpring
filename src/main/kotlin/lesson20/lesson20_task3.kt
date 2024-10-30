package org.example.lesson20

private class Player(
    val keyAvailability: Boolean,
)

fun main() {
    val player1 = Player(false)
    val player2 = Player(true)

    openTheDoor(player1)
    openTheDoor(player2)
}

private val openTheDoor =
    { player: Player -> if (player.keyAvailability) println("Дверь открыта!") else println("Дверь заперта!") }