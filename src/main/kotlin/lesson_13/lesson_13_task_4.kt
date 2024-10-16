package org.example.lesson_13

class ContactFill(
    val name: String,
    val phoneNumber: Long? = null,
    var company: String? = null
) {
    companion object {
        val contactListAll: MutableList<ContactFill> = mutableListOf()
    }

    fun showContacts() {
        contactListAll.forEach { println("Имя: ${it.name}, Телефон: ${it.phoneNumber}, Компания: ${it.company}") }
    }

    fun addToList() {
        contactListAll.add(this)
    }
}

fun main() {

    println("Добавьте пользователя в записную книжку.")

    addUser()

    ContactFill("", 0).showContacts()
}

fun addUser(): ContactFill {
    println("Введите имя:")
    val name = readLine().toString()

    println("Введите телефон:")
    val phone = readLine()?.toLongOrNull()

    if (phone == null) {
        println("Вы не ввели номер телефона. Этот пользователь не будет добавлен.")
        return addUser()
    }

    println("Введите название компании:")
    val companyRead = readln()

    val company = if (companyRead.isEmpty()) {
        null
    } else {
        companyRead
    }

    val contact = ContactFill(name, phone, company)
    contact.addToList()

    repeatAddUser()
    return ContactFill(name, phone, company)
}

fun repeatAddUser() {
    println("Хотите добавить еще пользователя? (да/нет)")
    val answer = readln()

    if (answer == "да" || answer == "Да") {
        addUser()
    } else {
        println("Завершение добавления пользователей.")
        return
    }
}