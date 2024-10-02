package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("лук", "морковь", "картофель", "соль", "курица", "вермишель", "черный перец", "вода")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach{
        println(it)
    }

}