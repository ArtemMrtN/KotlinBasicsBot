package org.example.lesson_20

class Robot {

    val listOfPhrase = mutableListOf(
        "Hello, world! I'm robot",
        "Я готов работать",
        "Мне нужна зарядка, села батарейка",
        "Мне нужно масло, смазать детали",
        "Выполняю свою работу"
    )

    fun say() {
        println(listOfPhrase.random())
    }

    fun setModifier(function: (String) -> String) {
        listOfPhrase.replaceAll { function(it) }
    }
}

fun main() {

    val robot = Robot()

    val modifier = { phrase: String -> phrase.split(" ").reversed().joinToString(" ") }

    robot.say()
    robot.setModifier(modifier)
    robot.say()

}