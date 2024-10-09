package org.example.lesson_12

class WeatherForecast(_daytimeTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {

    var daytimeTemperature = _daytimeTemperature
    var nightTemperature = _nightTemperature
    var precipitation = _precipitation

    fun checkWeather() {
        println("Погода днем: $daytimeTemperature, погода ночью: $nightTemperature. Осадки: $precipitation")
    }

}

fun main() {

    val weatherMonday = WeatherForecast(23,11, false)

    weatherMonday.checkWeather()

    val weatherTuesday = WeatherForecast(16,9,true)

    weatherTuesday.checkWeather()

}