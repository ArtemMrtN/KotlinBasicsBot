package org.example.lesson_12

class WeatherForecast(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean
) {

    fun checkWeather() {

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

    val weatherMonday = WeatherForecast(23,11, false)

    weatherMonday.checkWeather()

    val weatherTuesday = WeatherForecast(16,9,true)

    weatherTuesday.checkWeather()

}