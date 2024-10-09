package org.example.lesson_11

class MemberOfTheForum(
    var userId: Int,
    var userName: String,
) {
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {}

object Forum {

    var countId: Int = 1
    var allUsers: MutableList<MemberOfTheForum> = mutableListOf()
    var allMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): MemberOfTheForum {
        countId++
        allUsers.add(MemberOfTheForum(countId, name))
        return MemberOfTheForum(countId, name)
    }

    fun createNewMessage(id: Int, mess: String): ForumMessage? {
        val searchUser = allUsers.find { it.userId == id }
        allMessage.add(ForumMessage(id, mess))
        return searchUser?.let { ForumMessage(id, mess) }

    }

    fun printThread() {
        for (message in allMessage) {
            val user = allUsers.find { it.userId == message.authorId }
            if (user != null) {
                println("${user.userName}: ${message.message}")
            }
        }

    }
}

fun main() {

    val user1 = Forum.createNewUser("Artem")
    val user2 = Forum.createNewUser("Andrey")

    val mess1 = Forum.createNewMessage(user2.userId,"Всем привет!")
    val mess2 = Forum.createNewMessage(user1.userId,"Мне нравится")

    Forum.printThread()

}