package org.example.lesson_7

fun main() {

    val password = mutableListOf<String>()

    println("Задайте длину пароля. Минимальная длина пароля будет - 6 символов")
    var passwordLength = readln().toInt()

    if (passwordLength < 6) {
        passwordLength = 6
    }

    val digits = "0123456789"
    val lowerCase = "abcdefghijklmnopqrstuvwxyz"
    val upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val specialChars = "!@#\$%^&*()_+{}|:<>?"

    for (i in 1..passwordLength) {
        if (i % 5 == 0) {
            val passwordRandom = (digits).random().toString()
            password.add(passwordRandom)
        } else if (i % 4 == 0) {
            val passwordRandom = (lowerCase).random().toString()
            password.add(passwordRandom)
        } else if (i % 3 == 0) {
            val passwordRandom = (upperCase).random().toString()
            password.add(passwordRandom)
        } else if (i % 2 == 0) {
            val passwordRandom = (specialChars).random().toString()
            password.add(passwordRandom)
        } else {
            val passwordRandom = (specialChars).random().toString()
            password.add(passwordRandom)
        }
    }
    println("Сгенерированный пароль: ${password.shuffled().joinToString(separator = "")}")
}