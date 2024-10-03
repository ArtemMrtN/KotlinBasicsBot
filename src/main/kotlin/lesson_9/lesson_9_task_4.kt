package org.example.lesson_9

fun main() {

    println("Напишите список из пяти ингредиентов, разделенных запятой с пробелом: \", \"")

    val ingredients = readln()

    val listOfIngredients = ingredients.split(", ").toList().sorted()

    println(listOfIngredients)

}