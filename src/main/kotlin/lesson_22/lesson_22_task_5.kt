package org.example.lesson_22

data class GalacticGuide(
    val title: String,
    val description: String,
    val dateAndTime: String,
    val distanceFromEarth: Double
)

fun main() {

    val alphaCentauri = GalacticGuide("Alpha Centauri", "Тройная звёздная система в созвездии Центавра. Два компонента, солнцеподобные α Центавра А и α Центавра B, невооружённому глазу видны как одна звезда −0,27m, благодаря чему α Центавра является третьей по яркости звездой ночного неба", "2024-11-12",  4.36)

    println(alphaCentauri.component1())
    println(alphaCentauri.component2())
    println(alphaCentauri.component3())
    println(alphaCentauri.component4())

}