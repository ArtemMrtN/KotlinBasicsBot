package org.example.lesson_17

class Package(
    val id: Int,
    currentLocation: String,
) {
    var currentLocation: String = currentLocation
        set(value) {
            if (field != value) {
                field = value
                counter++
            }
        }
    var counter = 0
}

fun main() {

    val package1 = Package(1, "Москва")

    package1.currentLocation = "Нижний Новгород"
    package1.currentLocation = "Казань"
    package1.currentLocation = "Самара"

    println(package1.counter)

}