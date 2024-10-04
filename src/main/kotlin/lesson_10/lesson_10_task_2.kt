package org.example.lesson_10

fun main() {

    println("Для регистрации в приложении создайте логин и пароль. \nВведите свой логин:")
    val userName = readln()

    println("Введите пароль:")
    val userPassword = readln()

    lengthValidation(userName, userPassword)

}

fun lengthValidation(userName: String, userPassword: String) {

    if (userName.length < 4 || userPassword.length < 4) {
        println("Логин или пароль недостаточно длинные")
    }

}