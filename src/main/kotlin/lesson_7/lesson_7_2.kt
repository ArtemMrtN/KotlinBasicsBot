package org.example.lesson_7

fun main() {

    do {
        val pin = (1000..9999).random()
        println("Ваш код авторизации: $pin")

        println("Введите код авторизации:")
        val userResponse = readln().toInt()

        if (userResponse == pin) {
            println("Код введен верно, добро пожаловать!")
            return
        }

    } while (userResponse != pin)

}