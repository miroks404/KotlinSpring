package org.example.lesson21

private class Player(
    val name: String,
    var healthPoint: Int,
    val maxHealthPoint: Int,
)

fun main() {
    val player1 = Player("zhenya", 50, 100)

    val player2 = Player("miorks", 100, 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}

private fun Player.isHealthy(): Boolean = healthPoint == maxHealthPoint