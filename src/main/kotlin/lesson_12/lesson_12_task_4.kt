package org.example.lesson_12

class WeatherShowImmediately(daytimeTemperature: Int, nightTemperature: Int, precipitation: Boolean) {

    init {
        val precipitationText: String

        if (precipitation == false) {
            precipitationText = "Нет"
        } else {
            precipitationText = "Да"
        }

        println("Погода днем: $daytimeTemperature, погода ночью: $nightTemperature. Осадки: $precipitationText")
    }

}

fun main() {

    val weatherMonday = WeatherShowImmediately(23,11, false)

    val weatherTuesday = WeatherShowImmediately(16,9,true)

}