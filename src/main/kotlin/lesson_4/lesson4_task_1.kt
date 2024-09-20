package org.example.lesson_4

fun main() {

    val bookedForToday = 13
    val freeForTomorrow = 4
    val bookedForTomorrow = TOTAL_TABLES - freeForTomorrow

    val mesForToday = "Доступность столиков на сегодня: ${TOTAL_TABLES > bookedForToday}"
    val mesForTomorrow = "Доступность столиков на завтра: ${TOTAL_TABLES > bookedForTomorrow}"

    println("$mesForToday\n$mesForTomorrow")

}

const val TOTAL_TABLES = 13