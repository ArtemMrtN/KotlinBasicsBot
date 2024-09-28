package org.example.lesson_7

fun main() {

    val a = ('a' ..'z').random().toString()
    val b = ('0' ..'9').random().toString()
    val c = ('a' ..'z').random().toString()
    val d = ('0' ..'9').random().toString()
    val e = ('a' ..'z').random().toString()
    val f = ('0' ..'9').random().toString()

    val password = a + b + c + d + e + f

    println("Сгенерированный пароль: $password")

}