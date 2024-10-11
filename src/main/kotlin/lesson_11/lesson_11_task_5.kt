package org.example.lesson_11

class MemberOfTheForum(
    var userId: Int,
    var userName: String,
) {}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {}

class Forum {

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

    val forum = Forum()

    val user1 = forum.createNewUser("Artem")
    val user2 = forum.createNewUser("Andrey")

    val mess1 = forum.createNewMessage(user1.userId, "Задачи становятся сложнее и интереснее")
    val mess2 = forum.createNewMessage(user2.userId, "Прорвемся!")

    forum.printThread()

}