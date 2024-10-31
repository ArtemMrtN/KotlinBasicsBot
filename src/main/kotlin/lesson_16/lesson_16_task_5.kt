package org.example.lesson_16

interface PlayerActions {
    fun takeDamage(amount: Int)

    fun treat(amount: Int)
}

class Player(
    val name: String,
    health: Int,
    var strength: Int,
    var alive: Boolean = true,
) : PlayerActions {
    var health: Int = health

    override fun takeDamage(amount: Int) {
        if (health > 0) {
            println("Игрок получил урон $amount")
            health -= amount
        } else {
            die()
            println("Здоровье: $health")
        }
    }

    override fun treat(amount: Int) {
        if (health > 0) {
            println("Игрок восстановил здоровье на $amount")
            health += amount
            println("Здоровье: $health")
        }
    }

    private fun die() {
        health = 0
        strength = 0
        alive = false
        println("Игрок умер")
    }

}

fun main() {

    val player = Player("Artem", 100, 60)

    do {
        val amountDamage = (1..99).random()
        val amountTreat = (1..30).random()
        player.takeDamage(amountDamage)
        player.treat(amountTreat)
    } while (player.alive)

}