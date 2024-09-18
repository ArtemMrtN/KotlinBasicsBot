package org.example.lesson_2

fun main() {

    val buff = 0.2
    val crystalOre = 7
    val ironOre = 11

    val crystalOreBuff = crystalOre * buff
    val ironOreBuff = ironOre * buff

    println("Бонус кристаллической руды: ${crystalOreBuff.toInt()}")
    println("Бонус железной руды: ${ironOreBuff.toInt()}")

}