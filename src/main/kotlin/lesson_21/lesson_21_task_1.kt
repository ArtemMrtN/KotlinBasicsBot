package org.example.lesson_21

fun main() {

    val stringText = "Посчитать количество гласных в этой строке"

    stringText.vowelCount(stringText)

}

fun String.vowelCount(text: String) {
    val vowels = "аеёиоуыэюяAEЁИОУЫЭЮЯaeiouAEIOU"
    val count = text.count { it in vowels }
    println("Количество гласных: $count")
}