package org.example.lesson_19

class Tank {

    var cartridge: Cartridge? = null

    fun loadCartridge(_cartridge: Cartridge) {
        println("Зарядить $_cartridge")
        cartridge = _cartridge
    }

    fun shoot() {
        if (cartridge != null) {
            println("Нанесен урон ${cartridge!!.power}")
        } else {
            println("Патрон не заряжен")
        }
    }
}

fun main() {

    val tank = Tank()

    tank.shoot()
    tank.loadCartridge(Cartridge.BLUE)
    tank.shoot()
    tank.loadCartridge(Cartridge.GREEN)
    tank.shoot()
    tank.loadCartridge(Cartridge.RED)
    tank.shoot()

}

enum class Cartridge(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}