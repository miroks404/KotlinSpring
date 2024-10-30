package org.example.lesson18

import kotlin.math.pow

private abstract class Package {
    open fun getSurfaceArea() {}
}

private class RectanglePackage(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Package() {
    override fun getSurfaceArea() {
        println("Площадь поверхности: ${2 * (length * width + length * height + width * height)}")
    }
}

private class CubePackage(
    private val ribLength: Double,
) : Package() {
    override fun getSurfaceArea() {
        println("Площадь поверхности: ${ribLength.pow(2) * 6}")
    }
}

fun main() {
    val package1 = RectanglePackage(2.00, 3.00, 4.00)
    val package2 = CubePackage(4.00)

    package1.getSurfaceArea()
    package2.getSurfaceArea()
}