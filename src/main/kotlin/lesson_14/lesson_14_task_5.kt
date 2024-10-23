package org.example.lesson_14

open class Chat {
    val messages: MutableList<Message> = mutableListOf()
    val childMessages: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(text: String, author: String, id: Int) {
        val mess = Message(text, author, id)
        messages.add(mess)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int, id: Int) {
        val child = ChildMessage(text, author, parentMessageId, id)
        childMessages.add(child)
    }

    fun printChat() {

        val groupedChildMessages = childMessages.groupBy { it.parentMessageId }

        messages.forEach { message ->
            println("${message.text}. Автор: ${message.author}")

            val children = groupedChildMessages[message.id]
            if (children != null && children.isNotEmpty()) {

                children.forEach { childMessage ->
                    println("\t${childMessage.text}, Автор: ${childMessage.author}")
                }
            }
            println()

        }
    }
}

class Message(
    val text: String,
    val author: String,
    var id: Int,
)

class ChildMessage(
    val text: String,
    val author: String,
    val parentMessageId: Int,
    var id: Int,
)

fun main() {

    val chat = Chat()

    chat.addMessage("Добрый день, есть вопрос", "Artem", 0)
    chat.addThreadMessage("Могу дать совет", "Павел", 0, 1)
    chat.addThreadMessage("Не смогу помочь", "Елена", 0, 2)
    chat.addThreadMessage("Здравс", "Никита", 0, 3)
    chat.addMessage("Добрый день!", "X", 1)
    chat.addMessage("Привет!", "Andrey", 2)

    chat.printChat()

}