package org.example.lesson_19

class Product (
    val name: String,
    val id: Int,
    val category: Categories,
) {
    fun printProductInfo() {
        println("Название: $name\nID: $id\nКатегория: ${category.printCategory()}\n")
    }
}

fun main() {

    val product1 = Product("Футболка", 1, Categories.CLOTH)
    val product2 = Product("Шорты", 2, Categories.CLOTH)
    val product3 = Product("Бумага A4", 3, Categories.STATIONERY)
    val product4 = Product("Карандаш", 4, Categories.STATIONERY)
    val product5 = Product("Синяя ручка", 5, Categories.STATIONERY)
    val product6 = Product("Бинокль", 6, Categories.OTHER)

    val products = listOf<Product>(product1, product2, product3, product4, product5, product6)

        products.forEach{it.printProductInfo()}


}

enum class Categories {
    CLOTH,
    STATIONERY,
    OTHER;

    fun printCategory(): String {
        return when (this) {
            CLOTH -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Разное"
        }
    }
}