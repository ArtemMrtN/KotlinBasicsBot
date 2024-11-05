package org.example.lesson_18

abstract class Animals(
    val name: String,
) {
    abstract fun eat()

    fun sleep() {
        println("спит")
    }
}

class Fox(name: String) : Animals(name) {
    override fun eat() {
        println("$name - ест ягоды")
    }
}

class Dog(name: String) : Animals(name) {
    override fun eat() {
        println("$name - ест кости")
    }
}

class Cat(name: String) : Animals(name) {
    override fun eat() {
        println("$name - ест рыбу")
    }
}

fun main() {

    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val arrayOfAnimals = arrayOf<Animals>(fox, dog, cat)

    arrayOfAnimals.forEach { it.eat() }

}