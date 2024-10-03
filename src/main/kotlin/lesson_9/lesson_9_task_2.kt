package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("лук", "морковь", "картофель")

    println("В рецепте есть базовые ингредиенты: $ingredients\nЖелаете добавить еще?")
    val answer = readln()

    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredients = readln()
        ingredients.add(userIngredients)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}