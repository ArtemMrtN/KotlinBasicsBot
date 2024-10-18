package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String
) {
    abstract fun square(): Double

    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun square(): Double {
        return radius * radius * PI
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun square(): Double {
        return (width * height).toDouble()
    }

    override fun perimeter(): Double {
        return ((width + height) * 2).toDouble()
    }
}

fun main() {

    val allList: MutableList<Figure> = mutableListOf()

    allList.add(Circle("Черный", 5))
    allList.add(Circle("Черный", 4))
    allList.add(Circle("Белый", 3))
    allList.add(Circle("Белый", 2))
    allList.add(Rectangle("Черный", 5, 3))
    allList.add(Rectangle("Белый", 7, 4))
    allList.add(Rectangle("Черный", 6, 2))
    allList.add(Rectangle("Белый", 10, 1))

    val sumBlackPerimeter = allList.filter { it.color == "Черный" }.sumOf { it.perimeter() }
    val sumWhiteSquare = allList.filter { it.color == "Белый" }.sumOf { it.square() }

    println(sumBlackPerimeter)
    println(sumWhiteSquare)

}