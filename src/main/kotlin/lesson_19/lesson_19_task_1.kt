package org.example.lesson_19

fun main() {

    println("Вы можете добавить в свой аквариум следующих рыбок:")
    for (i in TypesOfFish.values()) {
        println(i.title)
    }

}

enum class TypesOfFish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}