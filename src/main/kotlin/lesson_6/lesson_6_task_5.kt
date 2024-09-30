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

    var counter = 3

    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()

        println("Для входа в приложение решите простой математический пример: \n$firstNumber + $secondNumber = ?\nНапишите ответ:")

        val exampleAnswer = firstNumber + secondNumber

        val simpleMathExample = readln().toInt()

        if (exampleAnswer == simpleMathExample) {
            println("Добро пожаловать!")
            break
        } else {
            counter--
            println(counter)
        }

        if (counter == 0) {
            println("Доступ запрещен.")
        }

    } while (counter > 0)

}