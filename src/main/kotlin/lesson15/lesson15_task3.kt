package org.example.lesson15

interface Actions{
    fun readChat()
    fun newMessage()
}

interface AdminActions{
    fun deleteMessage()
    fun deleteUser()
}

abstract class User(
    val userName: String,
) : Actions {
    override fun readChat() {
        println("$userName: Чтение чата")
    }

    override fun newMessage() {
        println("$userName: Новое сообщение")
    }
}

class Admin(
    userName: String,
) : User(userName), AdminActions {
    override fun deleteMessage() {
        println("$userName: Удаление сообщения")
    }

    override fun deleteUser() {
        println("$userName: Удаление пользователя")
    }
}

class Member(
    userName: String,
) : User(userName)


fun main() {
    val newUser = Member("Олег")
    val newAdmin = Admin("Евгений")

    newUser.readChat()
    newUser.newMessage()

    println()

    newAdmin.readChat()
    newAdmin.deleteMessage()
    newAdmin.deleteUser()
}

