package org.example.lesson_20

class PlayerInGame(
    var isKey: Boolean,
)

fun main() {

    val user = PlayerInGame(false)

    val findTheKey: (user: PlayerInGame) -> String = {
        (if (user.isKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }).toString()
    }

    println(findTheKey(user))

    user.isKey = true

    println(findTheKey(user))

}