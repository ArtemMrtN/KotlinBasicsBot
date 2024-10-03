package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("лук", "морковь", "картофель", "соль", "курица", "вермишель", "черный перец", "вода")
    println(ingredients.contentToString())

    println("Напишите какой ингредиент вы хотите заменить?")

    val searchIngredient = readln()
    val index = ingredients.indexOf(searchIngredient)

    if (index == -1) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("$searchIngredient в рецепте есть!\nНапишите какой ингредиент вы хотите добавить:")
        val newIngredient = readln()
        ingredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    }

}