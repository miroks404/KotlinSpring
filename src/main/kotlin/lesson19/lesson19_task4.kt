package org.example.lesson19

private enum class AmmunitionType {
    BLUE,
    GREEN,
    RED,
    NOTHING,
}

private class Tank(
    private var ammunition: AmmunitionType = AmmunitionType.NOTHING
) {
    fun getNewAmmunition(ammunition: AmmunitionType) {
        this.ammunition = ammunition
    }

    fun shot() {
        when (this.ammunition) {
            AmmunitionType.BLUE -> println("Нанесен урон в 5 ед")
            AmmunitionType.GREEN -> println("Нанесен урон в 10 ед")
            AmmunitionType.RED -> println("Нанесен урон в 20 ед")
            AmmunitionType.NOTHING -> println("Вы не заряжены!")
        }
    }
}

fun main() {
    val tank1 = Tank()
    val tank2 = Tank()

    tank1.getNewAmmunition(AmmunitionType.BLUE)
    tank2.getNewAmmunition(AmmunitionType.RED)

    tank1.shot()
    tank2.shot()
}