package org.example.lesson10

fun main() {
    val userToken = authorization()
    if (userToken == null) {
        println("Неуспешная авторизация")
        return
    }

    println(getListOfShoppingCart(userToken))
}

fun authorization(): String? {
    print("Введите логин: ")
    val inputLogin = readln()
    print("Введите пароль: ")
    val inputPassword = readln()

    if (inputLogin == LOGIN && inputPassword == PASSWORD) {
        val token = generationToken()
        return token
    } else return null
}

fun generationToken(): String {
    val allChars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    var token = ""
    for (i in 1..32) {
        token += allChars.random()
    }
    return token
}

fun getListOfShoppingCart(resultToken: String?): String = if (resultToken == null) "Неуспешная авторизация"
else SHOPPING_CART // Только чуть чуть не понял зачем тут принимать токен, если мы в main функции можем закрыть программу если нет токена

const val LOGIN = "miroks"
const val PASSWORD = "12345"
const val SHOPPING_CART = "куртка, обувь, зонт"