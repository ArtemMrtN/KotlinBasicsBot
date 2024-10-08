package org.example.lesson_5

fun main() {

    println("Вас встречает параноидальный робот-андройд Марвин.")
    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...] \nЧто ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. \nЯ всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] \nДа, вперед, пожалуйста, вводите свои данные...")

    val userName = readln()

    if (userName == USER) {
        println("Назовите пароль:")
        val userPassword = readln()
        if (userPassword == PASSWORD) {
            println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... \nПользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". \nХотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] \nНадеюсь, вам понравится пребывание здесь больше, чем мне.")
        } else {
            println("Пароль не совпадает!")
        }
    } else {
        println("Такого пользователя у нас нет, пожалуйста, зарегистрируйтесь!")
    }
}

const val USER = "Zaphod"
const val PASSWORD = "PanGalactic"