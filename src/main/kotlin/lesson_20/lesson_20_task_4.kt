package org.example.lesson_20

fun main() {

    val listOfStrings = listOf("1", "2", "3", "4", "5", "6", "7")
    val mapList = listOfStrings.map { it -> { println("Нажат элемент $it") } }

    mapList.forEachIndexed { index, element ->
        if ((index + 1) % 2 == 0) {
            element()
        }
    }

}