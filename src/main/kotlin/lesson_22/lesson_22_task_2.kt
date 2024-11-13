package org.example.lesson_22

class RegularBookCopy(
    val title: String,
    val author: String
)

data class DataBookCopy(
    val title: String,
    val author: String
)

fun main() {

    val regularBook = RegularBookCopy("451 градус по Фаренгейту", "Рэй Брэдбери")
    val dataBook = DataBookCopy("451 градус по Фаренгейту", "Рэй Брэдбери")

    println(regularBook)
    // тут распечатывается ссылка на объект, так выглядит строковое представление по умолчанию
    println(dataBook)
    // data class позволяет выводить данные

}