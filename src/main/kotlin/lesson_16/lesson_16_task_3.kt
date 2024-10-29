package org.example.lesson_16

class UserLoginPassword(
    val user: String,
    private val password: String,
) {
        fun checkPassword(passwordFromInput: String) {
            if (password == passwordFromInput) {
                println("Пароль верный")
            } else {
                println("Пароль введен не верно")
            }
        }

}

fun main() {

    val user = UserLoginPassword("Artem", "1234")

    println("Для проверки введите пароль:")
    val password = readln()

    user.checkPassword(password)

}