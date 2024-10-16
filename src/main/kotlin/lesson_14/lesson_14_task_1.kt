package org.example.lesson_14

open class LinerShip(
    val speed: Int = 30,
    val loadCapacity: Int = 20,
    val numberOfPassengers: Int = 1000,
)

class CargoShip : LinerShip(10, 50, 5)

class IcebreakerShip(
    val ability: String = "Колоть лёд",
) : LinerShip(10, 20, 5)

fun main() {

    val linerShip = LinerShip()
    val cargoShip = CargoShip()
    val icebreakerShip = IcebreakerShip()

}