package org.example.lesson_14

open class LinerShipLoading(
    val speed: Int = 30,
    val loadCapacity: Int = 20,
    val numberOfPassengers: Int = 1000,
) {
    open fun loadOntoShip() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShipLoading : LinerShipLoading(10, 50, 5) {
    override fun loadOntoShip() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class IcebreakerShipLoading(
    val ability: String = "Колоть лёд"
) : LinerShipLoading(10, 20, 5) {
    override fun loadOntoShip() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {

    val linerShip = LinerShipLoading()
    linerShip.loadOntoShip()

    val cargoShip = CargoShipLoading()
    cargoShip.loadOntoShip()

    val icebreakerShip = IcebreakerShipLoading()
    icebreakerShip.loadOntoShip()

}