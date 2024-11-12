package org.example.lesson_21

class PlayerInComputerGame(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun main() {

    val user = PlayerInComputerGame("Artem", 34, 100)

    user.isHealthy()

}

fun PlayerInComputerGame.isHealthy() {
    println(currentHealth == maxHealth)
}