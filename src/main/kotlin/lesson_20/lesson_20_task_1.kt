package org.example.lesson_20

fun main() {

    val username = "Artem"

    val printGreetings: () -> String = {
        "С наступающим Новым Годом, $username!"
    }

    println(printGreetings())

}