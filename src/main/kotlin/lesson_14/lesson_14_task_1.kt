package org.example.lesson_14

open class LinerShip(
    val speed: Int = 30,
    val loadCapacity: Int = 20,
    val numberOfPassengers: Int = 1000,
)

class CargoShip(
    speed: Int = 10,
    loadCapacity: Int = 50,
    numberOfPassengers: Int = 5,
)

class IcebreakerShip(
    speed: Int = 10,
    loadCapacity: Int = 20,
    numberOfPassengers: Int = 5,
    val ability: String = "Колоть лёд"
)

fun main() {

    val linerShip = LinerShip()
    val cargoShip = CargoShip()
    val icebreakerShip = IcebreakerShip()

}