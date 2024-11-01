package org.example.lesson20

class Robot(
    private val listOfPhrases: List<String> = listOf(
        "Бежит по телу сладостная дрожь",
        "По той же все, нехоженой судьбе",
        "Сдави и омой дрожащую кость",
        "Белеют скверы и тропинки",
        "Березка капельками света"
    ),
    var phrase: String = ""
) {
    fun say() {
        phrase = listOfPhrases[listOfPhrases.indices.random()]
        println(phrase)
    }

    fun setModifier(modifier: (String) -> String) {
        phrase = modifier(phrase)
    }

    fun say(phrase: String) {
        println(phrase)
    }
}

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier(modifier)

    robot.say(robot.phrase)
}

val modifier: (String) -> String = { modifier: String -> "$modifier!" }