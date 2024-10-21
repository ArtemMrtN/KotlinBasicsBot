package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val atmosphere: Boolean,
    val suitableForPlanting: Boolean,
)

open class Planet(
    name: String,
    atmosphere: Boolean,
    suitableForPlanting: Boolean,
    val allSatellites: MutableList<Satellite> = mutableListOf(),
) : CelestialBody(name, atmosphere, suitableForPlanting) {
    fun assignParent(satellites: Satellite) {
        allSatellites.add(satellites)
    }
    fun printSatellites(name: Planet) {
        println("${name.name}: ")
        name.allSatellites.forEach { println(it.name)}
    }
}

class Satellite(
    name: String,
    atmosphere: Boolean,
    suitableForPlanting: Boolean,
    planet: Planet
) : CelestialBody(name, atmosphere, suitableForPlanting) {
    init {
        planet.assignParent(this)
    }
}

fun main() {

    val planet1 = Planet("Планета 1", true, true)
    val satellite1 = Satellite("Спутник 1", true, false, planet1)
    val satellite2 = Satellite("Спутник 2", false, false, planet1)

    planet1.printSatellites(planet1)

}