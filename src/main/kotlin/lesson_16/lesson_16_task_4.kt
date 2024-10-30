package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var status: String,
) {
    fun sendRequestToTheManager(newStatus: String) {
        status = newStatus
        println("Новый статус заказа: $status")
    }
}

fun main() {

    val order = Order(1, "Сборка заказа")
    val newStatus = readln()

    order.sendRequestToTheManager(newStatus)

}