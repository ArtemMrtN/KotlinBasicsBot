package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val amount: Int

    abstract fun sendToServer(server: WeatherServer)
}

class Temperature(override val amount: Int) : WeatherStationStats() {
    override fun sendToServer(server: WeatherServer) {
        server.send(this)
    }
}

class PrecipitationAmount(override val amount: Int) : WeatherStationStats() {
    override fun sendToServer(server: WeatherServer) {
        server.send(this)
    }
}

class WeatherServer {
    fun send(type: WeatherStationStats) {
        if (type is Temperature) {
            println("Температура: ${type.amount}")
        } else {
            println("Количество осадков: ${type.amount} мм")
        }
    }
}

fun main() {

    val weather = WeatherServer()

    val day1 = Temperature(20)
    val day2 = PrecipitationAmount(12)

    day1.sendToServer(weather)
    day2.sendToServer(weather)

}