package org.example.lesson16

private class Player(
    val name: String,
    private var healthPoint: Int,
    private var impactStrength: Int,
    private var healingOption: Boolean = true,
) {
    fun takingDamage(damagePower: Int) {
        healthPoint -= damagePower
        println("Игрок $name получил урон на $damagePower хп\nЕго здоровье составляет $healthPoint")
        if (healthPoint <= 0) die()
    }

    fun healing(healingPower: Int) {
        if (healingOption) {
            healthPoint += healingPower
            println("Игрок $name исцелился на $healingPower хп\nЕго здоровье составляет $healthPoint хп")
        } else println("У игрока $name нет возможности исцелиться")
    }

    private fun die() {
        healthPoint = 0
        impactStrength = 0
        healingOption = false
        println("Игрок $name мертв")
    }
}

fun main() {
    val player1 = Player("miroks404", 100, 10)

    player1.takingDamage(60)

    player1.healing(10)

    player1.takingDamage(60)

    player1.healing(100)
}