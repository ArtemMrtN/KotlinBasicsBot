package org.example.lesson_3

fun main() {

    val motion = "D2-D4;0"

    val splitList = motion.split("-", ";")
    val (directionFrom, directionTo, strokeNumber) = splitList

    println("Откуда ход: $directionFrom")
    println("Куда ход: $directionTo")
    println("Номер хода: $strokeNumber")

}