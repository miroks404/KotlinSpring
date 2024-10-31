package org.example.lesson18

private abstract class Object {
    open fun draw(xInt: Int, yInt: Int) {}
    open fun draw(xFloat: Float, yFloat: Float) {}

}

private class CircleInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO("Not yet implemented")
    }
}

private class CircleFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw(xFloat: Float, yFloat: Float) {
        TODO()
    }
}

private class SquareInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO("Not yet implemented")
    }
}

private class SquareFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw(xFloat: Float, yFloat: Float) {
        TODO()
    }
}

private class DotInt(
    private val xInt: Int,
    private val yInt: Int,
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO("Not yet implemented")
    }
}

private class DotFloat(
    private val xFloat: Float,
    private val yFloat: Float,
) : Object() {
    override fun draw(xFloat: Float, yFloat: Float) {
        TODO()
    }
}

private class Screen(
    private val figure: Object,
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO()
    }

    override fun draw(xFloat: Float, yFloat: Float) {
        TODO()
    }
}

fun main() {

}
