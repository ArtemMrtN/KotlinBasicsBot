package org.example.lesson_20

class UserInComputerGame(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {}

fun main() {

    val user = UserInComputerGame("Artem", 34, 100)

    val cure: (user: UserInComputerGame) -> Unit = {
        user.currentHealth = user.maxHealth
    }

    cure(user)

    println(user.currentHealth)

}