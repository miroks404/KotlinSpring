package org.example.lesson17

private class Package(
    val numberOfPackage: Int,
    currentLocation: String,
) {
    var currentLocation = currentLocation
        set(value) {
            field = value
            motionCounter++
        }

    var motionCounter = 0
}

fun main() {
    val package1 = Package(26, "Китай")

    println(package1.currentLocation)
    println(package1.motionCounter)

    println()

    package1.currentLocation = "Россия"

    println(package1.currentLocation)
    println(package1.motionCounter)
}