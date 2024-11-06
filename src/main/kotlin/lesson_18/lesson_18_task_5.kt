package org.example.lesson_18

class Screen {

    fun draw(x: Int, y: Int, figure: String) {
        println("Нарисован $figure с координатами $x (Int), $y (Int)")
    }

    fun draw(x: Float, y: Int, figure: String) {
        println("Нарисован $figure с координатами $x (Float), $y (Int)")
    }

    fun draw(x: Int, y: Float, figure: String) {
        println("Нарисован $figure с координатами $x (Int), $y (Float)")
    }

    fun draw(x: Float, y: Float, figure: String) {
        println("Нарисован $figure с координатами $x (Float), $y (Float)")
    }
}

fun main() {

    val screen = Screen()

    screen.draw(3, 4, "точка")
    screen.draw(3, 3.2f, "точка")
    screen.draw(3.5f, 6, "круг")
    screen.draw(3, 3.2f, "квадрат")

}