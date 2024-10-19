package org.example.lesson_14

abstract class CelestialBodies(
    val name: String,
    val atmosphere: Boolean,
    val suitableForPlanting: Boolean,
)

open class Planets(
    name: String,
    atmosphere: Boolean,
    suitableForPlanting: Boolean,
    val allSatellites: MutableList<Satellites> = mutableListOf(),
) : CelestialBodies(name, atmosphere, suitableForPlanting) {
    fun assignParent(satellites: Satellites) {
        allSatellites.add(satellites)
    }
    fun printSatellites(name: Planets) {
        println("${name.name}: ")
        name.allSatellites.forEach { println(it.name)}
    }
}

class Satellites(
    name: String,
    atmosphere: Boolean,
    suitableForPlanting: Boolean,
    planet: Planets
) : CelestialBodies(name, atmosphere, suitableForPlanting) {
    init {
        planet.assignParent(this)
    }
}

fun main() {

    val planet1 = Planets("Планета 1", true, true)
    val satellite1 = Satellites("Спутник 1", true, false, planet1)
    val satellite2 = Satellites("Спутник 2", false, false, planet1)

    planet1.printSatellites(planet1)

}