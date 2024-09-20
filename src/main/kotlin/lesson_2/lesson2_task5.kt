package org.example.lesson_2

import kotlin.math.pow

const val PERCENT = 100
const val ONE = 1

fun main() {

    val amountOfInvestments = 70000
    val interestRate: Double = 16.7
    val numberOfYears = 20

    val deposit = amountOfInvestments * (ONE + interestRate / PERCENT).pow(numberOfYears)

    println("%.3f".format(deposit))

}