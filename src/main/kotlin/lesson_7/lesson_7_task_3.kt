package org.example.lesson_7

fun main() {

    println("Задайте число, до которого необходимо вывести все четные числа от нуля:")
    val targetNumber = readln().toInt()

    for (i in 0..targetNumber step 2) {
        println(i)
    }

}