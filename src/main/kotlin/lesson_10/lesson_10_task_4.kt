package org.example.lesson_10

var playerWin = 0

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

    if (playerMove > pcMove) {
        playerWin++
    }

    continueGame(playerWin)

}

fun rollDice() = (1..6).random()

fun continueGame(playerWin:Int) {

    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln()

    if (answer == "Да" || answer == "да") {
        main()
    } else {
        println("Количества выигрышных партий человека: $playerWin")
    }

}