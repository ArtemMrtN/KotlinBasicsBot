package org.example.lesson_16

class Dice {
    private val number = (1..6).random()

    fun printNumber() {
        println(number)
    }
}

fun main() {

    val dice = Dice()

    dice.printNumber()

}