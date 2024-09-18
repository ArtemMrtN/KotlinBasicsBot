package org.example.lesson_2

fun main() {

    val scoreStudents = listOf(3, 4, 3, 5)
    val quantityStudents = scoreStudents.size

    val averageScore = (scoreStudents.sum()).toDouble() / quantityStudents

    println(averageScore)

}