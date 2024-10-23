package org.example.lesson_15

interface Fly {
    fun move() {
        println("Летаю")
    }
}

interface Float {
    fun move() {
        println("Плаваю")
    }
}

class FlyingCreature(val name: String) : Fly {}

class FloatingCreature(val name: String) : Float {}

class FloatingAndFlyingCreature(val name: String) : Fly {
    override fun move() {
        println("Летаю и плаваю")
    }}

fun main() {

    val carp = FloatingCreature("Карась")
    val gull = FlyingCreature("Чайка")
    val duck = FloatingAndFlyingCreature("Утка")

    carp.move()
    gull.move()
    duck.move()

}