package org.example.lesson21

fun main() {
    val playerSkills: Map<String, Int> = mapOf("Скилл1" to 100, "Скилл2" to 250, "Скилл3" to 50, "Скилл4" to 250)

    playerSkills.maxCategory()
}

fun Map<String, Int>.maxCategory() {
    val maxValue = this.maxOf { values.max() }
    for (i in this) {
        if (i.value == maxValue) {
            println(i.key)
            break
        }
    }
}