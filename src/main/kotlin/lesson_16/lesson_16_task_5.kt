package org.example.lesson_16

interface PlayerActions {
    fun takeDamage(amount: Int)

    fun treat(amount: Int)
}

class Player(
    val name: String,
    health: Int,
    var strength: Int,
) : PlayerActions {
    var health: Int = health

    override fun takeDamage(amount: Int) {
        println("Игрок получил урон $amount")
        health -= amount
        if (health <= 0) {
            die()
        } else println("Здоровье: $health")
    }

    override fun treat(amount: Int) {
        if (health > 0) {
            println("Игрок восстановил здоровье на $amount")
            health += amount
            println("Здоровье: $health")
        } else println("Не получится вылечить")
    }

    private fun die() {
        health = 0
        strength = 0
        println("Игрок умер")
    }

}

fun main() {

    val player = Player("Artem", 100, 60)

    do {
        val amountDamage = (1..99).random()
        player.takeDamage(amountDamage)

        val amountTreat = (1..30).random()
        player.treat(amountTreat)

    } while (player.health > 0)

}