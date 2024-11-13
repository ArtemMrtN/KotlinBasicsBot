package org.example.lesson_22

data class BookInfo(
    val title: String,
    val author: String,
    val numberOfPages: Int
)

fun main() {

    val book = BookInfo("451 градус по Фаренгейту", "Рэй Брэдбери", 200)
    val (title, author, numberOfPages) = book
    println("Название: $title\nАвтор: $author\nСтраниц: $numberOfPages")

}