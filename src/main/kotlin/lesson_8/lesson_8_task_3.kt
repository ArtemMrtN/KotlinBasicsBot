package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("лук", "морковь", "картофель", "соль", "курица", "вермишель", "черный перец", "вода")

    println("Напишите какой ингредиент вы ищите?")
    val searchIngredient = readln()

    if (searchIngredient in ingredients) {
        println("$searchIngredient в рецепте есть!")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}