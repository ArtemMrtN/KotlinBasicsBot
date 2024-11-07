package org.example.lesson_18

open class Package {
    open fun createPackage() {}
}

class Rectangular (
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Package() {
    override fun createPackage() {
        val area = length * width * height
        println(area)
    }
}

class Cube(
    private val length: Int,
) : Package() {
    override fun createPackage() {
        val area = length * length * length
        println(area)
    }
}

fun main() {

    val rectangular: Package = Rectangular(2, 2, 4)
    val cube: Package = Cube(4)

    rectangular.createPackage()
    cube.createPackage()

}