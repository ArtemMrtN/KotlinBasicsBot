package org.example.lesson_16

class Circle (
    private val radius: Int
) {
    private val pi = 3.14

    fun length() {
        val result = 2 * pi * radius
        println(result)
    }
    fun square() {
        val result = pi * radius * radius
        println(result)
    }
}

fun main() {

    val circle = Circle(5)

    circle.length()
    circle.square()

}