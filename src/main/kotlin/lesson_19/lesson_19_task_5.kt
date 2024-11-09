package org.example.lesson_19

class Person(
    val name: String,
    val gender: Gender,
)

fun main() {

    val cardIndex: MutableList<Person> = mutableListOf()

    println("Чтобы добавить человека в картотеку, введите данные. Нужно ввести имя и пол. \nПол может быть \"MEN\" или \"WOMAN\" (В любом регистре)")

    do {

        println("Введите имя:")
        val name: String = readLine().toString()

        var gender: Gender? = null
        while (gender == null) {
            println("Введите пол (\"MEN\" или \"WOMAN\"):")
            val genderInput = readLine()
            gender = when (genderInput?.uppercase()) {
                "MEN" -> Gender.MEN
                "WOMAN" -> Gender.WOMAN
                else -> {
                    println("Введены некорректные данные, попробуйте снова.")
                    null
                }
            }
        }

        val person = Person(name, gender)
        cardIndex.add(person)

    } while (cardIndex.size < CARD_INDEX_NEED_SIZE)

    println("Люди в картотеке:")
    cardIndex.forEach { println("Имя: ${it.name}, Пол: ${it.gender}") }

}

enum class Gender {
    MEN,
    WOMAN,
}

const val CARD_INDEX_NEED_SIZE = 5