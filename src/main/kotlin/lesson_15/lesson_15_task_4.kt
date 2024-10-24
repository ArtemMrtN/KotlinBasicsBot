package org.example.lesson_15

interface SearchStore {
    fun searchComponent() {
        println("Выполняется поиск")
    }
}

abstract class Product(
    val name: String,
    val numberOfUnitsInStock: Int,
)

class Instrument(
    name: String,
    numberOfUnitsInStock: Int,
    val mutableList: MutableList<Component> = mutableListOf()
) : Product(name, numberOfUnitsInStock), SearchStore {}

class Component(
    name: String,
    numberOfUnitsInStock: Int,
) : Product(name, numberOfUnitsInStock) {}

fun main() {

    val instrument1 = Instrument("Гитара", 2)

    instrument1.searchComponent()

}