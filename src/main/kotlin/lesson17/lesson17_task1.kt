package org.example.lesson17

private class Quiz (
    var question: String = "Сколько цветов в радуге",
    var answer: String = "6"
){
    val getQuestion: String
        get() = "Вопрос: $question"
    var getAnswer: String = ""
        get() = "Ответ: $answer"
        set(value) {field = value}
}

fun main() {
    val quiz1 = Quiz()

    println(quiz1.getQuestion)
    println(quiz1.getAnswer)
}