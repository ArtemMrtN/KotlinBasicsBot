package org.example.lesson_7

fun main() {

    val password = mutableListOf<String>()

    println("Задайте длину пароля. Минимальная длина пароля будет - 6 символов")
    var passwordLength = readln().toInt()

    if (passwordLength < 6) {
        passwordLength = 6
    }

    val digits = ('0'..'9').toList()
    val lowerCase = ('a'..'z').toList()
    val upperCase = ('A'..'Z').toList()
    val specialChars = "!@#\$%^&*()_+{}|:<>?".toList()
    val allChars = lowerCase + upperCase + digits + specialChars

    for (i in 1..passwordLength) {
        when (i) {
            1 -> password.add(lowerCase.random().toString())
            2 -> password.add(upperCase.random().toString())
            3 -> password.add(digits.random().toString())
            4 -> password.add(specialChars.random().toString())
            else -> password.add(allChars.random().toString())
        }
    }
    println("Сгенерированный пароль: ${password.shuffled().joinToString(separator = "")}")
}