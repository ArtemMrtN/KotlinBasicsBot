package org.example.lesson_13

class ContactFillString(
    val name: String,
    val phoneNumber: Long? = null,
    var company: String? = null
) {
    companion object {
        val contactListAll: MutableList<ContactFillString> = mutableListOf()
    }

    fun showContacts() {
        contactListAll.forEach { println("Имя: ${it.name}, Телефон: ${it.phoneNumber}, Компания: ${it.company}") }
    }

    fun addToList() {
        contactListAll.add(this)
    }
}

fun main() {

    println("Введите номер телефона:")

    try {
        val phone: String = readLine().toString()
        val contact = ContactFillString("Артем", phone.toLong())
        contact.addToList()
        contact.showContacts()
    } catch (e: Exception) {
        println("Введенные данные не являются числом.")
    }

}