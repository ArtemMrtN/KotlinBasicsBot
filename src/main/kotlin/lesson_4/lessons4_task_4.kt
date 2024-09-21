package org.example.lesson_4

fun main() {

    val trainingDay = 5

    println("""
        Упражнения для рук:     ${trainingDay % 2 == 1}
        Упражнения для ног:     ${trainingDay % 2 == 0}
        Упражнения для спины:   ${trainingDay % 2 == 0}
        Упражнения для пресса:  ${trainingDay % 2 == 1}
    """.trimIndent())

}