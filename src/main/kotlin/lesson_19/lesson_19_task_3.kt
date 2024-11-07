package org.example.lesson_19

class Spaceship {

    fun takeWing() {
        TODO("Здесь нужна информация о дополнительной логике")
    }

    fun landOn() {
//        TODO()
    }

    fun shootBackAtAnAsteroid() {}
}

fun main() {

    val spaceship = Spaceship()

    try {
        spaceship.takeWing()
    } catch (e: NotImplementedError) {
        println(e.message)
    }
    spaceship.landOn()

}