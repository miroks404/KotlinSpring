package org.example.lesson4

fun main() {
    val hands = true
    val legs = true
    val back = true
    val abs = true
    val day = 5
    val evenDay = day % EVEN_OR_ODD == 0
    val oddDay = day % EVEN_OR_ODD == 1
    println(
        """
        Упражнения для рук: ${hands == oddDay}
        Упражнения для ног: ${legs == evenDay}
        Упражнения для спины: ${back == evenDay}
        Упражнения для пресса: ${abs == oddDay}
    """.trimIndent()
    )
}

const val EVEN_OR_ODD = 2