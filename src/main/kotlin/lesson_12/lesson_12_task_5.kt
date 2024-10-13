package org.example.lesson_12

import kotlin.random.Random

class WeatherMonth(val daytimeTemperature: Int, val nightTemperature: Int, val precipitation: Boolean) {

    init {
        val precipitationText: String

        if (!precipitation) {
            precipitationText = "Нет"
        } else {
            precipitationText = "Да"
        }

        println("Погода днем: $daytimeTemperature, погода ночью: $nightTemperature. Осадки: $precipitationText")
    }

}

fun main() {

    val qtyDays = 30

    val dayWeather = mutableListOf<Int>()
    val nightWeather = mutableListOf<Int>()
    val allPrecipitation = mutableListOf<Boolean>()

    val weather = mutableListOf<WeatherMonth>()
    
    for (i in 1..qtyDays) {
        weather.add(controlWeather(dayWeather, nightWeather, allPrecipitation))
    }

    println("Температура за месяц по дням:")
    println(dayWeather.toString())
    println("Температура за месяц по ночам:")
    println(nightWeather.toString())

    calculateAverage(weather)

    countPrecipitationDays(allPrecipitation)

}

fun controlWeather(dayWeather: MutableList<Int>, nightWeather: MutableList<Int>, allPrecipitation: MutableList<Boolean>): WeatherMonth {
    val nightWeatherRate = (1..9).random()
    val dayWeatherNow = (5..30).random()
    val nightWeatherNow = dayWeatherNow - nightWeatherRate
    val precipitationNow = Random.nextBoolean()

    dayWeather.add(dayWeatherNow)
    nightWeather.add(nightWeatherNow)
    allPrecipitation.add(precipitationNow)

    return WeatherMonth(dayWeatherNow, nightWeatherNow, precipitationNow)
}

fun calculateAverage(weather: MutableList<WeatherMonth>) {
    val averageDay = weather.map { it.daytimeTemperature }.average()
    val averageNight = weather.map { it.nightTemperature }.average()

    println("Среднее значение дневных температур: $averageDay")
    println("Среднее значение ночных температур: $averageNight")
}

fun countPrecipitationDays(allPrecipitation: MutableList<Boolean>) {
    val precipitationDays = allPrecipitation.filter { it }
    val count = precipitationDays.size
    println("Количество дней с осадками: $count")
}