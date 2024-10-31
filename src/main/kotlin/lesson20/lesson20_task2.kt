package org.example.lesson20

private class Player(
    val name: String,
    var healthPoint: Int,
    val maxHealthPoint: Int,
)

fun main() {
    val player1 = Player("miroks404", 55, 100)

    println(player1.healthPoint)

    getHeal(player1)

    println(player1.healthPoint)
}

private val getHeal = {player: Player -> player.healthPoint = player.maxHealthPoint}