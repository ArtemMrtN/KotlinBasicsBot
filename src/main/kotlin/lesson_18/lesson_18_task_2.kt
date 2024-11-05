package org.example.lesson_18

abstract class AllDice(
    val numberOfFaces: Int
) {
    fun throwDice() {
        val range = 1..numberOfFaces
        val valueDice = range.random()
        println(valueDice)
    }
}

class DiceFour : AllDice(numberOfFaces = 4)

class DiceSix : AllDice(numberOfFaces = 6)

class DiceEight : AllDice(numberOfFaces = 8)

fun main() {

    val dice1 = DiceFour()
    val dice2 = DiceFour()
    val dice3 = DiceSix()
    val dice4 = DiceEight()
    val dice5 = DiceEight()
    val dice: List<AllDice> = listOf(dice1, dice2, dice3, dice4, dice5)

    for (i in dice) {
        i.throwDice()
    }

}