package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("лук", "морковь", "картофель", "соль", "курица", "вермишель", "черный перец", "вода")

    println("Напишите какой ингредиент вы ищите?")
    val searchIngredient = readln()

    val qtyOfIngredients = ingredients.size - 1

    for (i in 0..qtyOfIngredients) {
        if (ingredients[i] == searchIngredient) {
            println("$searchIngredient в рецепте есть!")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}