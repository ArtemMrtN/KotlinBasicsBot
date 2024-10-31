package org.example.lesson_17

class ShipInGame(
    name: String,
    averageSpeed: Int,
    homePort: String,
) {
    var name: String = name
        set(value: String) {
            field = name
            println("Имя $value не принято!")
            println("Имя корабля менять нельзя")
        }
}

fun main() {

    val ship = ShipInGame("Молния", 150, "Лондон")

    ship.name = "Ржавое корыто"

}