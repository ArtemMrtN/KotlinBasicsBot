package org.example.lesson_12

class Weather() {

    var daytimeTemperature = 0
    var nightTemperature = 0
    var precipitation = false

    fun checkWeather() {
        println("Погода днем: $daytimeTemperature, погода ночью: $nightTemperature. Осадки: $precipitation")
    }

}

fun main() {

    val weatherMonday = Weather()
    weatherMonday.daytimeTemperature = 23
    weatherMonday.nightTemperature = 11
    weatherMonday.precipitation = false

    weatherMonday.checkWeather()

    val weatherTuesday = Weather()
    weatherTuesday.daytimeTemperature = 16
    weatherTuesday.nightTemperature = 9
    weatherTuesday.precipitation = true

    weatherTuesday.checkWeather()

}