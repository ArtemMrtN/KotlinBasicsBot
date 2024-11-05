package org.example.lesson_18

class Package {

    fun createPackage(length: Int, width: Int, height: Int) {
        val area = length * width * height
        println(area)
    }

    fun createPackage(length: Int) {
        val area = length * length * length
        println(area)
    }

}

fun main() {

    val package1 = Package()

    package1.createPackage(2, 2, 4)
    package1.createPackage(4)

}