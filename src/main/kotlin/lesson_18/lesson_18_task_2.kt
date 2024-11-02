package org.example.lesson_18

open class AllDice() {
    open fun throwDice() {
        println("Выпало число: ...")
    }
}

class DiceFour : AllDice() {
    override fun throwDice() {
        val valueDice: Int = (1..4).random()
        println(valueDice)
    }
}

class DiceSix : AllDice() {
    override fun throwDice() {
        val valueDice: Int = (1..6).random()
        println(valueDice)
    }
}

class DiceEight : AllDice() {
    override fun throwDice() {
        val valueDice: Int = (1..8).random()
        println(valueDice)
    }
}

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