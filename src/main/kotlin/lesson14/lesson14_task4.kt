package org.example.lesson14

abstract class CelestialBody(
    val planet: String,
)

class Planet(
    planet: String,
    val sputnik: String,
    val listOfSputniks: List<String> = sputnik.split(",").toList()
) : CelestialBody(planet)

fun main() {
    val planet1 = Planet("Земля", "Меркурий, Марс, Индивид")

    println(
        """
        -Название планеты: ${planet1.planet}
        -Название спутников этой планеты: ${planet1.listOfSputniks.joinToString(", ")}
    """.trimIndent()
    )
}