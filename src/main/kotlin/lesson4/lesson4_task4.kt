package org.example.lesson4

fun main() {
    val day = 5
    val isEvenDay = day % EVEN_OR_ODD == 0

    println(
        """
        Упражнения для рук: ${!isEvenDay}
        Упражнения для ног: ${isEvenDay}
        Упражнения для спины: ${isEvenDay}
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent()
    )
}

const val EVEN_OR_ODD = 2