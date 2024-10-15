package org.example.lesson_13

class ContactEmployee(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printEmployeeInformation() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val contact1 = ContactEmployee("Artem", 999L)
    contact1.printEmployeeInformation()

    val contact2 = ContactEmployee("Ростислав", 89123456789, "Reddit")
    contact2.printEmployeeInformation()

}