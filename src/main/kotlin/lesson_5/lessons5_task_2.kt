package org.example.lesson_5

import java.time.LocalDate

fun main() {

    println("Введите свой год рождения:")

    val userBirthYear = readln().toInt()
    val currentYear = LocalDate.now().year

    val userAge = currentYear - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }

}

const val AGE_OF_MAJORITY = 18