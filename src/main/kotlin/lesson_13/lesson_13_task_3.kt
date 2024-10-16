package org.example.lesson_13

val contactListAll: MutableList<ContactList> = mutableListOf()

class ContactList(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
)

fun main() {

    contactListAll.add(ContactList("Artem", 89171112233))
    contactListAll.add(ContactList("Alex", 89276665544))
    contactListAll.add(ContactList("Ростислав", 89123456789, "null"))
    contactListAll.add(ContactList("Владимир", 89123456789, "Google"))
    contactListAll.add(ContactList("Александр", 89123456789, "Reddit"))

    contactListAll.mapNotNull { it.company }.forEach { println(it) }

}