package org.example.lesson10

fun main() {
    do {
        game()
        print("Хотите сыграть еще (y/n)? ")
        val playerDecision = readln()
    } while (playerDecision == "y")
}

fun game() {
    val humanNumber = rollTheDice()
    val machineNumber = rollTheDice()

    println("Число у вас: $humanNumber")
    println("Число у машины: $machineNumber")

    result(humanNumber, machineNumber)
}

fun rollTheDice() : Int = (1..6).random()

fun result(humanNumber: Int, machineNumber: Int) {
    val result = if(humanNumber > machineNumber) "Победило человечество"
    else if (humanNumber < machineNumber) "Победила машина"
    else "Ничья!"

    println(result)
}
