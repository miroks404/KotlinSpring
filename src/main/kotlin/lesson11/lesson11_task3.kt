package org.example.lesson11

class Feed(
    var listOfRooms: MutableList<String>,
)

class Member(
    val avatar: String? = "none",
    val nickname: String,
    var status: String = "разговаривает",
) {
    fun changeStatus() {
        println("Введите статус: 1 - разговаривает, 2 - микрофон выключен, 3 - пользователь заглушен")
        val newStatus = readln().toInt()
        status = when (newStatus) {
            1 -> "разговаривает"
            2 -> "микрофон выключен"
            3 -> "пользователь заглушен"
            else -> "Такого статуса нет"
        }
        if (status == "Такого статуса нет") {
            println("Такого статуса нет!")
            return
        }
    }
}

class Room(
    val cover: String? = "none",
    val name: String,
    var listOfMembers: MutableList<String>,
) {
    fun addMember(member: Member) {
        listOfMembers.add(member.nickname)
    }
}

fun main() {
    val user1 = Member(
        nickname = "Zhenya",
    )

    val user2 = Member(
        nickname = "Oleg",
    )

    val room1 = Room(
        name = "Комната",
        listOfMembers = mutableListOf(user1.nickname)
    )

    val feed1 = Feed(
        listOfRooms = mutableListOf(room1.name)
    )

    println("Добавляем участника в комнату")
    room1.addMember(user2)

    println()

    println("Меняем статус учатника")
    user1.changeStatus()

    println()

    println("Выводим данные об учатниках")
    println(user1.nickname)
    println(user1.status)

    println()

    println(user2.nickname)
    println(user2.status)

    println()

    println("Выводим ленту")
    println(feed1.listOfRooms)

    println()

    println("Выводим комнату")
    println(room1.name)
    println(room1.listOfMembers)
}