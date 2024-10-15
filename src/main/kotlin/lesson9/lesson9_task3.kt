package org.example.lesson9

fun main() {
    val listOfOmelet = mutableListOf(2, 50, 15)

    print("Сколько порций вы хотите? ")
    val numberOfServings = readln().toInt()

    val resultListOfOmelet = listOfOmelet.map { it * numberOfServings }

    println("На $numberOfServings порций вам понадобится: Яиц - ${resultListOfOmelet[0]} шт," +
            " молока - ${resultListOfOmelet[1]} мл, сливочного масла - ${resultListOfOmelet[2]} гр")
}