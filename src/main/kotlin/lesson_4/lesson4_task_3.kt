package org.example.lesson_4

fun main() {

    val weatherToday: Boolean = true
    val awningToday: Boolean = true
    val airHumidityToday: Int = 20
    val seasonToday: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherToday == SUNNY_WEATHER && awningToday == OUTDOOR_AWNING && airHumidityToday == AIR_HUMIDITY && seasonToday != NOT_SEASON}")

}

const val SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true
const val AIR_HUMIDITY = 20
const val NOT_SEASON = "зима"