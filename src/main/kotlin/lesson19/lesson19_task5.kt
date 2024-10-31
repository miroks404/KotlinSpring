package org.example.lesson19

enum class Gender(val id: String){
    WOMAN("жен"),
    MAN("муж"),
    NOTHING(""),
}

private open class CardIndex(
    private val listOfUsers: MutableList<User> = mutableListOf()
) {
    private fun addUserToList(user: User) {
        listOfUsers.add(user)
    }

    fun createNewUser(name: String, gender: Gender) {
        val newUser = User(name, gender)
        addUserToList(newUser)
        if (listOfUsers.size == 5) {
            listOfUsers.forEach { user ->
                println("""
                    -Имя: ${user.name}
                    -Пол: ${getGender(user.gender)}
                """.trimIndent())
                println()
            }
        }
    }
}


private class User(
    val name: String,
    val gender: Gender,
)

fun main() {
    val cardIndex1 = CardIndex()
    for (i in 1..5) {
        print("Введите имя (на русском): ")
        val inputName = readln()
        print("Введите пол (муж или жен): ")
        val inputGender = readln()
        val getGender = when (inputGender) {
            Gender.MAN.id -> Gender.MAN
            Gender.WOMAN.id -> Gender.WOMAN
            else -> Gender.NOTHING
        }
        cardIndex1.createNewUser(inputName, getGender)
    }

}

fun getGender(id: Gender) : String {
    val gender = when (id) {
        Gender.WOMAN -> return "женский"
        Gender.MAN -> return "мужской"
        Gender.NOTHING -> "неизвестный пол"
    }
    return gender
}