package org.example.lesson5

fun main() {
    val firstNumber = 11
    val secondNumber = 36

    print("Введите первое число (от 0 до 42): ")

    val firstTryNumber = readln().toInt()

    print("Введите второе число (от 0 до 42): ")

    val secondTryNumber = readln().toInt()

    if ((firstTryNumber == firstNumber || firstTryNumber == secondNumber) && (secondTryNumber == firstNumber ||
                secondTryNumber == secondNumber)
    ) println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstTryNumber == firstNumber || firstTryNumber == secondNumber) || (secondTryNumber == firstNumber ||
                secondTryNumber == secondNumber)
    ) println("Вы выиграли утешительный приз!")
    else println("Неудача!")
    println("Загаданные числа: $firstNumber и $secondNumber")
}