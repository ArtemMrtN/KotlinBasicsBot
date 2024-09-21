package org.example.lesson_2

fun main() {

    val buff = 20
    val crystalOre = 7
    val ironOre = 11

    val buffPercent: Double = buff.toDouble() / 100
    val crystalOreBuff = crystalOre * buffPercent
    val ironOreBuff = ironOre * buffPercent

    println("Бонус кристаллической руды: ${crystalOreBuff.toInt()}")
    println("Бонус железной руды: ${ironOreBuff.toInt()}")

}