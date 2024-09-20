package org.example.lesson_5

fun main() {

    val numberOne = 2
    val numberTwo = 3

    println("Чтобы пройти проверку необходимо правильно решить простой математический пример. \nСколько будет $numberOne + $numberTwo")
    val answer = readln().toInt()

    if (answer == numberOne + numberTwo) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}