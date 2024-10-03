package org.example.lesson_9

fun main() {

    val ingredientsForOne = listOf(2, 50, 15)

    println("Сколько порций омлета вам нужно?")
    val numberOfServings = readln()

    val ingredientsForAll = ingredientsForOne.map { it * numberOfServings.toInt() }

    println("На $numberOfServings порций вам понадобится: Яиц – ${ingredientsForAll[0]} шт., молока – ${ingredientsForAll[1]} мл, сливочного масла – ${ingredientsForAll[2]}гр.")

}