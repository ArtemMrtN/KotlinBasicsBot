package org.example.lesson_10

fun main() {

    println("Задайте нужную длинну пароля:")
    val length = readln().toInt()

    passwordLength(length)

}

fun passwordLength(length: Int) {

    val password: MutableList<String> = mutableListOf()

    for (i in 1..length) {
        val symbol = when {
            i % 2 == 0 -> "!\"#\$%&'()*+,-./ ".toList().random()
            else -> (0..9).random()
        }
        password.add(symbol.toString())
    }

    println(password.joinToString(""))

}