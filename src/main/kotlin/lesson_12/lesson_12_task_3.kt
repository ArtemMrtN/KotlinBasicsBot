package org.example.lesson_12

class WeatherInKelvin(daytimeTemperature: Int, nightTemperature: Int, precipitation: Boolean) {

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

    val weatherMonday = WeatherInKelvin(23,11, false)

    val weatherTuesday = WeatherInKelvin(16,9,true)

}