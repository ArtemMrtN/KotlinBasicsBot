package org.example.lesson_15

abstract class UserForum(
    val name: String,
) {
    fun readForum() {
        println("Читать форум")
    }

    fun writeMessage() {
        println("Написать сообщение")
    }
}

class RegularUserForum(name: String) : UserForum(name)

class AdminUserForum(name: String) : UserForum(name) {
    fun deleteMessage() {
        println("Удалить сообщение")
    }
}

fun main() {

    val regularUser = RegularUserForum("Artem")
    val adminUser = AdminUserForum("Ivan")

    regularUser.readForum()
    regularUser.writeMessage()
    adminUser.deleteMessage()

}