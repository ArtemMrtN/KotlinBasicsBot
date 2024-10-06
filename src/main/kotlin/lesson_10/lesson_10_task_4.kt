package org.example.lesson_10

fun main() {

    var playerWin = 0

    do {

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

        if (playerMove > pcMove) {
            playerWin++
        }

    } while (startGame())

    println("Количества выигрышных партий человека: $playerWin")

}

fun rollDice() = (1..6).random()

fun startGame(): Boolean {

    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln()

    val resultAnswer = answer == "Да" || answer == "да"

    return resultAnswer
}