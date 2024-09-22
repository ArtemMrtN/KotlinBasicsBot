package org.example.lesson_4

fun main() {

    println("Корабль не имеет повреждений (true или false):")
    val noDamage: Boolean = readLine().toBoolean()
    println("Введите число экипажа:")
    val crew: Int? = readLine()?.toInt()
    println("Количество ящиков с провизией на борту:")
    val boxesOfProvisions: Int? = readLine()?.toIntOrNull()
    println("Погода благоприятная? (true или false):")
    val weatherConditions: Boolean = readLine().toBoolean()

    println(
        "Научно-исследовательский корабль может приступить к долгосрочному плаванию: ${
            (noDamage == SHIP_HAS_NO_DAMAGE &&
                    crew in MIN_NUMBER_OF_CREW..OPTIMAL_NUMBER_OF_CREW && boxesOfProvisions != null &&
                    boxesOfProvisions > MIN_BOXES_OF_PROVISION) ||
                    (noDamage == SHIP_HAS_DAMAGE && crew != null && crew >= OPTIMAL_NUMBER_OF_CREW &&
                            boxesOfProvisions != null &&
                            boxesOfProvisions > MIN_BOXES_OF_PROVISION && weatherConditions == FAVORABLE_WEATHER)
        }"
    )

}

const val MIN_NUMBER_OF_CREW = 55
const val OPTIMAL_NUMBER_OF_CREW = 70
const val MIN_BOXES_OF_PROVISION = 50
const val FAVORABLE_WEATHER = true
const val SHIP_HAS_NO_DAMAGE = true
const val SHIP_HAS_DAMAGE = false