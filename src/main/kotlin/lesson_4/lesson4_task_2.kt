package org.example.lesson_4

fun main() {

    val cargoOneWeight = 20
    val cargoOneVolume = 80
    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    println("Груз с весом $cargoOneWeight кг и объемом $cargoOneVolume л соответствует категории 'Average': ${(cargoOneWeight > AVERAGE_WEIGHT_MIN && cargoOneWeight <= AVERAGE_WEIGHT_MAX) && cargoOneVolume < AVERAGE_VOLUME}")
    println("Груз с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л соответствует категории 'Average': ${(cargoTwoWeight > AVERAGE_WEIGHT_MIN && cargoTwoWeight <= AVERAGE_WEIGHT_MAX) && cargoTwoVolume < AVERAGE_VOLUME}")

}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100