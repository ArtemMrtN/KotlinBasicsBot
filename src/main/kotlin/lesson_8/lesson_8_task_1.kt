package org.example.lesson_8

fun main() {

    val adViews = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    for (i in 0..6) {
        val adViewsDay = (1..99).random()
        adViews[i] = adViewsDay
    }
    println("Просмотров рекламы за неделю было: ${adViews.sum()}")

}