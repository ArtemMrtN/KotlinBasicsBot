package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String
)

data class DataBook(
    val title: String,
    val author: String
)

fun main() {

    val regularBook1 = RegularBook("451 градус по Фаренгейту", "Рэй Брэдбери")
    val regularBook2 = RegularBook("451 градус по Фаренгейту", "Рэй Брэдбери")
    val dataBook1 = DataBook("451 градус по Фаренгейту", "Рэй Брэдбери")
    val dataBook2 = DataBook("451 градус по Фаренгейту", "Рэй Брэдбери")

    println(regularBook1 == regularBook2)
    // тут получается результат false, т.к сравниваются ссылки на объект, а не сами объекты
    println(dataBook1 == dataBook2)
    // а тут получается результат true, т.к data class позволяет сравнивать данные

}