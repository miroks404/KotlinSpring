package org.example.lesson11

import java.util.UUID

class Forum(
    val listOfMembers: MutableMap<String, String> = mutableMapOf(),
    val listOfMessages: MutableList<ForumMessage> = mutableListOf()
) {
    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(userName = userName)
        listOfMembers[newUser.userId] = newUser.userName
        return newUser
    }

    fun createNewMessage(userId: String, message: String): ForumMessage {
        val newMessage = ForumMessage(userId, message)
        listOfMessages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        for (message in listOfMessages) {
            println("${listOfMembers[message.userId]}: ${message.message}")
        }
    }
}

class ForumMember(
    val userId: String = UUID.randomUUID().toString(),
    val userName: String = ""
)

class ForumMessage(
    val userId: String = "",
    val message: String = ""
)

fun main() {
    val forum1 = Forum()
    val user1 = forum1.createNewUser("Олег")
    val user2 = forum1.createNewUser("Евгений")

    forum1.createNewMessage(user1.userId, "привет!")
    forum1.createNewMessage(user1.userId, "Как дела?")

    forum1.createNewMessage(user2.userId, "Дарова")
    forum1.createNewMessage(user2.userId, "Нормально!")

    forum1.printThread()
}
//Использовал gpt, потому что у меня выводилсоь по одному последнему сообщению юзера(