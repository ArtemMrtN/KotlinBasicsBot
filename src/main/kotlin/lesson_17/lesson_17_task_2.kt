package org.example.lesson_17

class ShipInGame(
    name: String,
    averageSpeed: Int,
    homePort: String,
) {
    var name: String = name
        set(value: String) = println("Имя корабля менять нельзя")
}

fun main() {

    val ship = ShipInGame("Молния", 150, "Лондон")

    ship.name = "Ржавое корыто"
    println(ship.name)

}