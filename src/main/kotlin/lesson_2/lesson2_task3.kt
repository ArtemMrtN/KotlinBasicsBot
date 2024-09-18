package org.example.lesson_2

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes: Duration = 457.minutes

    val travelHour = travelTimeInMinutes.inWholeHours
    val travelMinutes = travelTimeInMinutes.inWholeMinutes - travelHour.hours.inWholeMinutes

    val allMinute = departureMinute + travelMinutes
    val extraHour = allMinute.minutes.inWholeHours
    val arrivalHour = departureHour + travelHour + extraHour
    val arrivalMinute = allMinute - extraHour.hours.inWholeMinutes

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute.")

}