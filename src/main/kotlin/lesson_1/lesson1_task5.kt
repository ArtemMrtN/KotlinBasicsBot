package org.example.lesson_1

import kotlin.math.min
import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun main() {

    val numberOfSeconds: Duration = 6480.seconds

    val hours = numberOfSeconds.inWholeHours
    val hoursDuration: Duration = hours.hours
    val minutes = numberOfSeconds.inWholeMinutes - hoursDuration.inWholeMinutes
    val minutesDuration: Duration = minutes.minutes
    val seconds = numberOfSeconds.inWholeSeconds - minutesDuration.inWholeSeconds - hoursDuration.inWholeSeconds

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}