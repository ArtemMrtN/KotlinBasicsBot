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

    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: ${(noDamage == true && crew in 55..70 && boxesOfProvisions != null && boxesOfProvisions > 50 )||(noDamage == false && crew != null && crew >= 70 && boxesOfProvisions != null && boxesOfProvisions > 50 && weatherConditions == true)}")

}