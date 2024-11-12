package org.example.lesson_21

class CharacterLevel(
    val map: Map<String, Int>
)

fun main() {

    val characterSkill = CharacterLevel(mapOf("strength" to 80, "stamina" to 50, "fortune" to 5, "base damage" to 5, "agility" to 50))

    characterSkill.maxCategory()

}

fun CharacterLevel.maxCategory(): String? {
    val maxValue = map.maxByOrNull { it.value }
    return maxValue?.key
}