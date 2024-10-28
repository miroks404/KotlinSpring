package org.example.lesson16

private class Order(
    private val numberOfOrder: String,
    private var statusOfOrder: String,
) {
    private fun changeStatus(newStatusOfOrder: String) {
        statusOfOrder = newStatusOfOrder
    }

    fun getRequestToTheManager(newStatusOfOrder: String) {
        println("Создано обращение к менеджеру по замене статуса заказа")
        changeStatus(newStatusOfOrder)
        println("Новый статус заказа: $statusOfOrder")
    }
}

fun main() {
    val order1 = Order("123", "Собирается")

    order1.getRequestToTheManager("Отправлен")
}