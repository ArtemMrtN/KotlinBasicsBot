package org.example.lesson_8

fun main() {

    println("Напишите количество планируемых ингредиентов:")
    val qtyOfIngredients = readln().toInt()
    val qtyForArray = qtyOfIngredients - 1

    val listOfIngredients = Array(qtyOfIngredients) { "" }

    for (i in 0 .. qtyForArray) {
        println("Напишите имя ингредиента, который нужно добавить:")
        val ingredient = readln()
        listOfIngredients[i] = ingredient
    }

    println(listOfIngredients.joinToString())

}