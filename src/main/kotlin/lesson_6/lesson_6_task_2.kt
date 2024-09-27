package org.example.lesson_6

fun main() {

    var numberOfSeconds = readln().toInt()
    val allSeconds = numberOfSeconds

    while (numberOfSeconds > 0) {
        numberOfSeconds--
        Thread.sleep(1000)
    }
    println("Прошло $allSeconds секунд")

}