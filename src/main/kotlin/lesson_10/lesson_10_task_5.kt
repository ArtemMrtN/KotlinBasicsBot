package org.example.lesson_10

import java.util.*

fun main() {

    val cart = listOf("картофель", "курица", "соль", "ананас", "ноутбук")
    val token: String

    println("Для авторизации введите данные. \nВведите логин:")
    val userLoginAuth = readln()

    println("Введите пароль:")
    val userPasswordAuth = readln()

    if (allowEntry(userLoginAuth, userPasswordAuth)) {
        token = generateToken()
        showCart(token, cart.toString())
    } else {
        println(null)
    }

}

fun allowEntry(userLoginAuth: String, userPasswordAuth: String) =
    userLoginAuth == USER_LOGIN && userPasswordAuth == USER_PASSWORD

fun showCart(token: String, cart: String) {
    println(cart)
}

fun generateToken(): String = UUID.randomUUID().toString()

const val USER_LOGIN = "Artem"
const val USER_PASSWORD = "12345"