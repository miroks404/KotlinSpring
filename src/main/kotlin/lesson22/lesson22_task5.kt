package org.example.lesson22

private data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateOfEvent: String,
    val distanceJOfAPlaceOrEventFromTheEarth: String,
)

fun main() {
    val (name, description, date, distance) = GalacticGuide(
        "Жоская туса",
        "Будет много людей и будем жоско тусить",
        "21 января в 6 утра",
        "6 световых лет"
    )

    println("""
        -Название места или события: $name
        -Описание места или события: $description
        -Дата и время: $date
        -Расстояние от Земли в световых годах: $distance
    """.trimIndent())
}