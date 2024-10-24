package org.example.lesson14

import java.util.UUID

open class Chat(
    val author: String = "",
    val message: String = "",
    val parentMessageId: UUID = UUID.randomUUID(),
    val childMessageId: UUID = UUID.randomUUID(),
    val messageId: UUID = UUID.randomUUID(),
    val allMessages: MutableList<Chat> = mutableListOf(),
) {
    fun addMessage(author: String, message: String): Message {
        val newMessage = Message(author, message)
        allMessages.add(newMessage)
        return newMessage
    }
    fun addThreadMessage(author: String, message: String, parentMessageId: UUID): ChildMessage {
        val newChildMessage = ChildMessage(author, message, parentMessageId)
        allMessages.add(newChildMessage)
        return newChildMessage
    }
    fun printChat() {
        for (i in allMessages) {
            if (i is ChildMessage) {
                allMessages.groupBy { it.parentMessageId }
                println("\t${i.author}: ${i.message}")
            }
            else {
                allMessages.groupBy { it.messageId }
                println("${i.author}: ${i.message}")
            }
        }
    }
}

class Message(
    author: String,
    message: String,
    parentMessageId: UUID = UUID.randomUUID(),
    messageId: UUID = UUID.randomUUID(),
) : Chat(author, message)

class ChildMessage(
    author: String,
    message: String,
    parentMessageId: UUID,
    messageId: UUID = UUID.randomUUID(),
) : Chat(author, message)

fun main() {
    val chat1 = Chat()

    val message1 = chat1.addMessage("Олег", "Всем добрейший вечерочек!))")
    val message2 = chat1.addThreadMessage("Жора", "Приветики!)", message1.parentMessageId)
    val message3 = chat1.addMessage("Евгений", "Кто знает как включить пк??")
    val message4 = chat1.addThreadMessage("Кира", "А с чего ты пишешь?", message2.parentMessageId)
    val message5 = chat1.addMessage("Мистер", "Кто любит печенье?")

    chat1.printChat()


}
// сначала очень долго думал реализацию списка allMessages, потом наконец-то додумался что туда можно просто запихнуть
// экземпляры класса Chat, затем не понял как реализовать printChat, чтобы он корректно писал дочерние сообщения,
// если они были добавлены после еще нескольких обычных сообщений,
// так и не понял как это реализовать и просто в fun main поменял порядок создания экземпляров
// до этого я создавал два обычных сообщения, потом дочернее к первому, потом обычное сообщение, потом дочернее ко второму
// но при такой последовательности у меня выводилось не правильно((

