package org.example.lesson_10

fun main() {

    println("Для регистрации в приложении создайте логин и пароль. \nВведите свой логин:")
    val userName = readln()

    println("Введите пароль:")
    val userPassword = readln()

    if (checkLength(userName, userPassword)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }

}

fun checkLength(userName: String, userPassword: String): Boolean {

    val minLength = 4
    val passwordLength = userName.length < minLength || userPassword.length < minLength
    return passwordLength

}