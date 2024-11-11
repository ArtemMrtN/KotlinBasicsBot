package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("TextFile.txt")

    file.writeWord("Первый текст")
    file.writeWord("Второй текст")
    file.writeWord("Это третий текст, но он перед первым и вторым текстом")
    file.writeWord("Четвертый текст")
    println(file.readText())

}

fun File.writeWord(text: String) {
    if (text !in this.readText()) {
        val currentContent = this.readText()
        this.writeText(text + "\n" + currentContent)
    }
}