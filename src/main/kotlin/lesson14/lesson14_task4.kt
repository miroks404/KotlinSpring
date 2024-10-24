package org.example.lesson14

abstract class CelestialBody(
    val planet: String,
) {
    abstract fun addSputnik(nameOfSputnik: String)
}

class Planet(
    planet: String,
    val listOfSputniks: MutableList<Sputnik> = mutableListOf(),
) : CelestialBody(planet) {
    override fun addSputnik(nameOfSputnik: String) {
        val newSputnik = Sputnik(super.planet, nameOfSputnik)
        listOfSputniks.add(newSputnik)
    }
}

class Sputnik(
    planet: String,
    val sputnik: String,
) : CelestialBody(planet) {
    override fun addSputnik(nameOfSputnik: String) {
        TODO("Not yet implemented")
    }
}

fun main() {
    val planet1 = Planet("Земля")
    val sputnik1 = planet1.addSputnik("Меркурий")
    val sputnik2 = planet1.addSputnik("Луна")

    print(
        """
        -Название планеты: ${planet1.planet}
        -Название спутников этой планеты: 
    """.trimIndent()
    )

    for (i in planet1.listOfSputniks) {
        print("${i.sputnik}, ")
    }
}