package org.example.lesson_15

interface Fly {
    fun fly() {
        println("Летаю")
    }
}

interface Float {
    fun float() {
        println("Плаваю")
    }
}

class FlyingCreature(val name: String) : Fly {}

class FloatingCreature(val name: String) : Float {}

class FloatingAndFlyingCreature(val name: String) : Fly, Float {}

fun main() {

    val carp = FloatingCreature("Карась")
    val gull = FlyingCreature("Чайка")
    val duck = FloatingAndFlyingCreature("Утка")

    carp.float()
    gull.fly()
    duck.fly()
    duck.float()

}