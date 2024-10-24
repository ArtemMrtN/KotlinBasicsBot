package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val amount: Int
}

class Temperature(override val amount: Int) : WeatherStationStats() {}

class PrecipitationAmount(override val amount: Int) : WeatherStationStats() {}

class WeatherServer {
    fun send(type: WeatherStationStats) {
        when (type) {
            is Temperature -> println("Температура: ${type.amount}")
            is PrecipitationAmount -> println("Количество осадков: ${type.amount} мм")
            else -> println("Неизвестный тип данных")
        }
    }
}

fun main() {

    val weather = WeatherServer()

    val day1 = Temperature(20)
    val day2 = PrecipitationAmount(12)

    weather.send(day1)
    weather.send(day2)

}