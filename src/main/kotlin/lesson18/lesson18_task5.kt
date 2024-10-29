package org.example.lesson18

private abstract class Object {
    abstract fun draw(): String
}

private class CircleInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw() = "Circle int"
}

private class CircleFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw() = "Circle float"
}

private class SquareInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw() = "Square int"
}

private class SquareFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw() = "Square float"
}

private class DotInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw() = "Dot int"
}

private class DotFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw() = "Dot float"
}

private class Screen(
    private val figure: Object,
) : Object() {
    override fun draw(): String = figure.draw()
}

fun main() {
    val screen1 = Screen(DotInt(1,2))
    println(screen1.draw())

    val screen2 = Screen(SquareFloat(3f,5f))
    println(screen2.draw())
}
