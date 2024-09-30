package org.example.lesson_7

fun main() {

    val password = mutableListOf<String>()

    for (i in 1..6) {
        if (i % 2 == 0) {
            val passwordEven = ('0'..'9').random().toString()
            password.add(passwordEven)
        } else {
            val passwordOdd = ('a'..'z').random().toString()
            password.add(passwordOdd)
        }
    }
    println("Сгенерированный пароль: ${password.joinToString(separator = "")}")

}