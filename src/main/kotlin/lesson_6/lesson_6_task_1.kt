package org.example.lesson_6

fun main() {

    println("Создайте свой аккаунт. \nВведите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    do {
        println("Чтобы войти в приложение, введите свои данные. \nВведите логин:")
        val userLoginAuth = readln()
        println("Введите пароль:")
        val userPasswordAuth = readln()
    } while (userLoginAuth != userLogin || userPasswordAuth != userPassword)

    println("Авторизация прошла успешно")

}