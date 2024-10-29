package org.example.lesson18

private abstract class Object {
    abstract fun draw()
}

private class CircleInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw() {
        println(xInt)
    }
}

private class CircleFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw() {
        println(xFloat)
    }
}

private class SquareInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw() {
        println(xInt)
    }
}

private class SquareFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw() {
        println(xFloat)
    }
}

private class DotInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw() {
        println(xInt)
    }
}

private class DotFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw() {
        println(xFloat)
    }
}

private class Screen(
    private val figure: Object,
) : Object() {
    override fun draw() {
        figure.draw()
    }
}

fun main() {
    val screen1 = Screen(DotInt(1,2))
    screen1.draw()

    val screen2 = Screen(SquareFloat(3f,5f))
    screen2.draw()
}
