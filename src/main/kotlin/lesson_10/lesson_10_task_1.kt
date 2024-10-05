package org.example.lesson_10

fun main() {

    println("Ход игрока:")
    val playerMove = rollDice()
    println(playerMove)

    println("Ход компьютера:")
    val pcMove = rollDice()
    println(pcMove)

    if (playerMove > pcMove) {
        println("Победило человечество!")
    } else if (playerMove < pcMove) {
        println("Победила машина")
    } else {
        println("Ничья!")
    }

}

fun rollDice() = (1..6).random()