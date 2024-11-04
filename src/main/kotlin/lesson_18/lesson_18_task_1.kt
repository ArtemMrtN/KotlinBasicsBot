package org.example.lesson_18

class CrmOrder(
    val id: Int,
) {
    fun showInformation(
        product: String
    ) {
        println("Заказан товар: $product")
    }

    fun showInformation(
        product: List<String>
    ) {
        println("Заказаны следующие товары: ${product.joinToString(", ")}")
    }
}

fun main() {

    val order1 = CrmOrder(1)
    order1.showInformation("Хлеб")

    val order2 = CrmOrder(2)
    order2.showInformation(listOf("Хлеб", "Яблоко", "Масло"))

}