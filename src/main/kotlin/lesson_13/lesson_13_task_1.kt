package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {}

fun main() {

    val contact1 = Contact("Artem", 999L)
    println(contact1.company)

}