package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("лук", "морковь", "картофель", "соль", "курица", "вермишель", "черный перец", "вода")
    println(ingredients.contentToString())

    println("Напишите какой ингредиент вы хотите заменить?")

    val searchIngredient = readln()

    if (searchIngredient in ingredients) {
        println("$searchIngredient в рецепте есть!\nНапишите какой ингредиент вы хотите добавить:")
        val newIngredient = readln()
        val index = ingredients.indexOf(searchIngredient)
        ingredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}