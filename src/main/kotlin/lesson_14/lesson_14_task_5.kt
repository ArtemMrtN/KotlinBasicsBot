package org.example.lesson_14

class ChatManager {
    private val chat = Chat()

    fun createMessage(text: String, author: String, id: Int): Message {
        return Message(text, author, id, chat)
    }

    fun createChildMessage(text: String, author: String, parentMessageId: Int, id: Int): ChildMessage {
        return ChildMessage(text, author, parentMessageId, id, chat)
    }

    fun printChat() {
        chat.printChat()
    }
}

open class Chat {
    val messages: MutableList<Message> = mutableListOf()
    val childMessages: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(mess: Message) {
        messages.add(mess)
    }

    fun addThreadMessage(child: ChildMessage) {
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
    var id: Int = 0,
    chat: Chat,
) {
    init {
        chat.addMessage(this)
    }
}

class ChildMessage(
    val text: String,
    val author: String,
    val parentMessageId: Int,
    var id: Int = 0,
    chat: Chat,
) {
    init {
        chat.addThreadMessage(this)
    }
}

fun main() {

    val chatManager = ChatManager()

    chatManager.createMessage("Добрый день, есть вопрос", "Artem", 0)
    chatManager.createChildMessage("Могу дать совет", "Павел", 0, 1)
    chatManager.createChildMessage("Не смогу помочь", "Елена", 0, 2)
    chatManager.createChildMessage("Здравс", "Никита", 0, 3)
    chatManager.createMessage("Добрый день!", "X", 1)
    chatManager.createMessage("Привет!", "Andrey", 2)

    chatManager.printChat()
}