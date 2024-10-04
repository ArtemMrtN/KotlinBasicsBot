package org.example.lesson_9

import java.util.*

fun main() {

    println("Напишите пять ингредиентов по отдельности/")

    val ingredients: MutableSet<String> = mutableSetOf()

    do {
        println("Напишите ингредиент:")
        val ingredient = readln()
        ingredients.add(ingredient)
    } while (ingredients.size < 5)

    val resultList = ingredients.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    println(resultList)

}