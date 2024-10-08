package org.example.lesson_11

class UserDesc(
    val avatar: String,
    val nickname: String,
    var status: String? = null,
) {
    fun updateStatus(searchNickname: String, newStatus: String?) {
        if (searchNickname == nickname) {
            status = newStatus
        }
    }
}

class Room(
    val cover: String,
    val title: String,
    var users: MutableList<UserDesc> = mutableListOf()
) {
    fun addUser(user: UserDesc) {
        users.add(user)
        println("В комнату добавлен пользователь ${user.nickname}")
    }
}

fun main() {

    val user1 = UserDesc(
        avatar = "url картинки",
        nickname = "Artem",
        status = "микрофон выключен",
    )
    val user2 = UserDesc(
        avatar = "url картинки",
        nickname = "Andrey",
        status = "разговаривает",
    )

    val room1 = Room(
        cover = "url картинки",
        title = "Комната 1",
    )

    val room2 = Room(
        cover = "url картинки",
        title = "Комната 2",
    )

    room1.addUser(user1)
    room1.addUser(user2)
    user1.updateStatus(user1.nickname, newStatus = "разговаривает")

    println(room1.users.map { it.status })

}