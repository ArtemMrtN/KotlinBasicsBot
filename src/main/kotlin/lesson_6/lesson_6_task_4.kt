package org.example.lesson_6

fun main() {

    val secretNumber = (0..9).random()
    println("Угадай загаданное число от 1 до 9:")
    var yourNumber = readln().toInt()
    var counter = 5
    val endCounter = 0

    while (yourNumber != secretNumber || counter > endCounter) {
        counter--
        if (yourNumber == secretNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            if (yourNumber != secretNumber && counter == endCounter) {
                println("Было загадано число $secretNumber")
                break
            }
            println("Неверно, осталось $counter попыток")
            yourNumber = readln().toInt()
        }
    }
}