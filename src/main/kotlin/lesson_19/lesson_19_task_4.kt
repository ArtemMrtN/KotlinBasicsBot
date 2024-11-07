package org.example.lesson_19

class Tank {

    lateinit var cartridge: Cartridges

    fun loadCartridge(_cartridge: Cartridges) {
        println("Зарядить $_cartridge")
        cartridge = _cartridge
    }

    fun shoot() {
        if (this::cartridge.isInitialized) {
            println("Нанесен урон ${cartridge.power}")
        } else {
            println("Патрон не заряжен")
        }
    }
}

fun main() {

    val tank = Tank()

    tank.shoot()
    tank.loadCartridge(Cartridges.BLUE)
    tank.shoot()
    tank.loadCartridge(Cartridges.GREEN)
    tank.shoot()
    tank.loadCartridge(Cartridges.RED)
    tank.shoot()

}

enum class Cartridges(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}