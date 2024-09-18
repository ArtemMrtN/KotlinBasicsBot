package org.example.lesson_2

import java.util.*
import kotlin.math.pow

fun main() {

    val amountOfInvestments = 70000
    val interestRate: Double = 16.7
    val numberOfYears = 20

    val depositTemp = (1 + interestRate / 100)
    val deposit = amountOfInvestments * depositTemp.pow(numberOfYears)

    println("%.3f".format(deposit))

}