package org.example.lesson_4

fun main() {

    val weatherToday: Boolean = true
    val awning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherToday == true && awning == true && airHumidity == 20 && season != "зима"}")

}