package org.example.lesson_10

fun main() {

    println("Задайте нужную длинну пароля:")
    val length = readln().toInt()

    println(generatePassword(length))

}

fun generatePassword(length: Int): String {

    val password: MutableList<String> = mutableListOf()

    val randomSymbol = (32..47).map { it.toChar() }
    val randomNumber = (0..9)

    for (i in 1..length) {
        val symbol = when {
            i % 2 == 0 -> randomSymbol.random()
            else -> randomNumber.random()
        }
        password.add(symbol.toString())
    }

    return password.joinToString("")

}