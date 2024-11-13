package org.example.lesson_21

fun main() {

    val intArray = arrayOf(1,2,3,4,5,6,7,8,9,10)

    intArray.evenNumbersSum()

}

fun Array<Int>.evenNumbersSum(): Int {
    val evenList = this.filter { it % 2 == 0 }
    return evenList.sum()
}