package org.example.lesson18

private abstract class Object{
    abstract fun draw(xInt: Int, yInt: Int)
    abstract fun draw(xFloat: Float, yFloat: Float)
}

private class Circle(
    xInt: Int,
    xFloat: Float,
    yInt: Int,
    yFloat: Float
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO("Not yet implemented")
    }

    override fun draw(xFloat: Float, yFloat: Float) {
        TODO("Not yet implemented")
    }
}

private class Square(
    xInt: Int,
    xFloat: Float,
    yInt: Int,
    yFloat: Float
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO("Not yet implemented")
    }

    override fun draw(xFloat: Float, yFloat: Float) {
        TODO("Not yet implemented")
    }
}

private class Dot(
    xInt: Int,
    xFloat: Float,
    yInt: Int,
    yFloat: Float
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {
        TODO("Not yet implemented")
    }

    override fun draw(xFloat: Float, yFloat: Float) {
        TODO("Not yet implemented")
    }
}

private class Screen(
    private val figure: Object,
) : Object() {
    override fun draw(xInt: Int, yInt: Int) {

    }
    override fun draw(xFloat: Float, yFloat: Float) {

    }
}

fun main() {
    val screen1 = Screen(Dot(1,0f,2,0f))

}
