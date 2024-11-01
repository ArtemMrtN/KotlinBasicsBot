package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var status: String,
) {
    fun sendRequestToTheManager(newStatus: String) {
        changeStatus(newStatus)
        println("Новый статус заказа: $status")
    }
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }
}

fun main() {

    val order = Order(1, "Сборка заказа")
    val newStatus = readln()

    order.sendRequestToTheManager(newStatus)

}