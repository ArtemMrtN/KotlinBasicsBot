package org.example.lesson_6

fun main() {

    val numberOfSeconds: Long = readln().toLong()
    val milliseconds: Long = numberOfSeconds * 1000

    Thread.sleep(milliseconds)
    println("Прошло $numberOfSeconds секунд")

}