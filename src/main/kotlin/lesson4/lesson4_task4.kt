package org.example.lesson4

fun main() {
    val hands = true
    val legs = true
    val back = true
    val abs = true
    val day = 5
    val isEvenDay = day % EVEN_OR_ODD == 0

    println(
        """
        Упражнения для рук: ${hands == !isEvenDay}
        Упражнения для ног: ${legs == isEvenDay}
        Упражнения для спины: ${back == isEvenDay}
        Упражнения для пресса: ${abs == !isEvenDay}
    """.trimIndent()
    )
}

const val EVEN_OR_ODD = 2