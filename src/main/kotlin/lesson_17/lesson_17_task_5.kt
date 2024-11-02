package org.example.lesson_17

class UserLoginAndPassword(
    login: String,
    password: String,
) {
    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен на $value")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

}

fun main() {

    val user = UserLoginAndPassword("Artem", "qwerty")

    user.password = "1234"
    println(user.password)
    user.login = "Andrey"

}