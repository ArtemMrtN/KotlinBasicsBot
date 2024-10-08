package org.example.lesson_11

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun userInformation () {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun fillBio() {
        println("Заполните bio:")
        bio = readln()
    }

    fun changePassword () {
        println("Вам необходимо сменить пароль. \nВведите текущий пароль:")
        val enteredPassword = readln()
        if (enteredPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль успешно изменен!")
        } else {
            println("Вы ввели пароль неправильно.")
        }
    }
}

fun main() {

    val user = User2 (
        id = 1,
        login = "Artem",
        password = "1234",
        email = "mail@gmail.com",
    )

    user.userInformation()
    user.fillBio()
    user.changePassword()

    println("Обновленная информация:")
    println(user.id)
    println(user.login)
    println(user.password)
    println(user.email)
    println(user.bio)

}