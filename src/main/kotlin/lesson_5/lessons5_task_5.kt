package org.example.lesson_5

import kotlin.random.Random

fun main() {

    println("Чтобы выиграть главный приз, нужно угадать три числа от 0 до 42.")

    val winningNumbers = List(3) { Random.nextInt(0, 42) }
    println("Введите поочередно три числа от 0 до 42 каждое:")

    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val thirdNumber = readln().toInt()
    val allNumbers = listOf(firstNumber, secondNumber, thirdNumber)

    val coincidences = allNumbers.intersect(winningNumbers)
    val countCoincidences = coincidences.size

    when {
        countCoincidences == 3 -> println("Вы угадали все числа и выиграли джекпот!")
        countCoincidences == 2 -> println("Вы угадали два числа и получаете крупный приз!")
        countCoincidences == 1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа!")
    }

    println("Выигрышные числа: $winningNumbers")

}