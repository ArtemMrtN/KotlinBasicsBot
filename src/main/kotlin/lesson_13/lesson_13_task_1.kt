package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {

    val contact1 = Contact("Artem", 999L, null)
    println(contact1.company)

}