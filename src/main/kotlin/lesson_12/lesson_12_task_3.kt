package org.example.lesson_12

class WeatherInKelvin(_daytimeTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {

    var daytimeTemperature = _daytimeTemperature
    var nightTemperature = _nightTemperature
    var precipitation = _precipitation

    init {

        val precipitationText: String

        if (precipitation == false) {
            precipitationText = "Нет"
        } else {
            precipitationText = "Да"
        }

        daytimeTemperature = (daytimeTemperature - TEMPERATURE_CONVERSION).toInt()
        nightTemperature = (nightTemperature - TEMPERATURE_CONVERSION).toInt()

        println("Погода днем: $daytimeTemperature, погода ночью: $nightTemperature. Осадки: $precipitationText")
    }

}

fun main() {

    val weatherMonday = WeatherInKelvin(273,261, false)

    val weatherTuesday = WeatherInKelvin(290,282,true)

}

const val TEMPERATURE_CONVERSION = 273.15