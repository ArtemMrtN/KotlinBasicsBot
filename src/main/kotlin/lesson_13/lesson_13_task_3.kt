package org.example.lesson_13

val contactListAll: MutableList<ContactList> = mutableListOf()

class ContactList(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {
    init {
        contactListAll.add(this)
    }
}

fun main() {

    val contact1 = ContactList("Artem", 89171112233)
    val contact2 = ContactList("Alex", 89276665544)
    val contact3 = ContactList("Ростислав", 89123456789, "null")
    val contact4 = ContactList("Владимир", 89123456789, "Google")
    val contact5 = ContactList("Александр", 89123456789, "Reddit")

    contactListAll.mapNotNull { it.company }.forEach{println(it)}

}