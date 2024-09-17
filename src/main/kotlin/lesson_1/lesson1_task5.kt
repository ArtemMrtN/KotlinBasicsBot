package org.example.lesson_1

fun main() {

//    Я не нашел сколько именно секунд провел Гагарин в космосе, нашел, что 108 минут.
//    Но секунд получается 0, я взял время из задачи: 01:30:09. Или нужно, чтобы было 00 секунд?

    val numberOfSeconds: Int = 5409

    val hours = numberOfSeconds / 3600
    val minutes = (numberOfSeconds / 60) - (hours * 60)
    val seconds = numberOfSeconds - hours * 3600 - minutes * 60

    print(String.format("%02d", hours))
    print(":")
    print(minutes)
    print(":")
    print(String.format("%02d", seconds))

//    Нашел такое решение String.format("%02d", seconds), но в уроке такого не было, не уверен,
//    что в задаче от меня требуется именно это

}