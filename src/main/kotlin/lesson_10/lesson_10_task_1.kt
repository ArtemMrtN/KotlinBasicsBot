package org.example.lesson_10

fun main() {

    println("Ход игрока:")
    val playerMove = rollDiceOld()
    println(playerMove)

    println("Ход компьютера:")
    val pcMove = rollDiceOld()
    println(pcMove)

    if (playerMove > pcMove) {
        println("Победило человечество!")
    } else if (playerMove < pcMove) {
        println("Победила машина")
    } else {
        println("Ничья!")
    }

}

fun rollDiceOld() = (1..6).random()