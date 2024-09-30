package org.example.lesson_7

fun main() {

    println("Задайте время в секундах для таймера:")
    val seconds = readln().toInt()

    for (i in 0..seconds) {
        println("До конца осталось: $i секунд.")
        Thread.sleep(1000)
    }

    println("Время вышло.")

}