package org.example.lesson_3

fun main() {
    var directionFrom = "E2"
    var directionTo = "E4"
    var strokeNumber = "1"

    var motion = "$directionFrom-$directionTo; $strokeNumber"
    println(motion)

    directionFrom = "D2"
    directionTo = "D3"
    strokeNumber = "2"

    motion = "$directionFrom-$directionTo; $strokeNumber"
    println(motion)
}