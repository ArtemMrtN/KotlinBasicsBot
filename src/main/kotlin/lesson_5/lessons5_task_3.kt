package org.example.lesson_5

fun main() {

    println("Чтобы выиграть главный приз, нужно угадать два числа от 0 до 42. \nВведите первое число от 0 до 42:")

    val firstNumber = readln().toInt()
    println("Введите второе число от 0 до 42:")
    val secondNumber = readln().toInt()

    when {
        firstNumber == WINNING_FIRST_NUMBER && secondNumber == WINNING_SECOND_NUMBER -> println("Поздравляем! Вы выиграли главный приз!")
        secondNumber == WINNING_FIRST_NUMBER && firstNumber == WINNING_SECOND_NUMBER -> println("Поздравляем! Вы выиграли главный приз!")
        firstNumber == WINNING_FIRST_NUMBER || secondNumber == WINNING_SECOND_NUMBER -> println("Вы выиграли утешительный приз!")
        secondNumber == WINNING_FIRST_NUMBER || firstNumber == WINNING_SECOND_NUMBER -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

}

const val WINNING_FIRST_NUMBER = 7
const val WINNING_SECOND_NUMBER = 26