package org.example.lesson11

import java.util.UUID

class Forum(
    val listOfMembers: MutableList<ForumMember> = mutableListOf(),
    val listOfMessages: MutableList<ForumMessage> = mutableListOf()
) {
    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(userName = userName)
        listOfMembers.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: String, message: String) {
        val newMessage = ForumMessage(userId, message)
        listOfMessages.add(newMessage)
    }

    fun printThread() {
        for (message in listOfMessages) {
            val member = listOfMembers.find { it.userId == message.userId }
            println("${member?.userName} : ${message.message}")
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