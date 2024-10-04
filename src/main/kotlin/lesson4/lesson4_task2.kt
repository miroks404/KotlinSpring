package org.example.lesson4

fun main() {
    val average = true
    var weightAverageInKilograms = 20
    var volumeAverageInLiters = 0

    println("Груз с весом $weightAverageInKilograms кг и объемом $volumeAverageInLiters л соответствует категории 'Average': ${average == (weightAverageInKilograms > MIN_KILOGRAMS && weightAverageInKilograms <= MAX_KILOGRAMS) and (volumeAverageInLiters < MAX_LITERS)}")

    weightAverageInKilograms = 50
    volumeAverageInLiters = 80

    println("Груз с весом $weightAverageInKilograms кг и объемом $volumeAverageInLiters л соответствует категории 'Average': ${average == (weightAverageInKilograms > MIN_KILOGRAMS && weightAverageInKilograms <= MAX_KILOGRAMS) and (volumeAverageInLiters < MAX_LITERS)}")

    weightAverageInKilograms = 0
    volumeAverageInLiters = 100

    println("Груз с весом $weightAverageInKilograms кг и объемом $volumeAverageInLiters л соответствует категории 'Average': ${average == (weightAverageInKilograms > MIN_KILOGRAMS && weightAverageInKilograms <= MAX_KILOGRAMS) and (volumeAverageInLiters < MAX_LITERS)}")
}

const val MIN_KILOGRAMS = 35
const val MAX_KILOGRAMS = 100
const val MAX_LITERS = 100