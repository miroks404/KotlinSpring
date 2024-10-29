package org.example.lesson18

private class Order {
    fun addOrder(
        numberOfOrder: String,
        shoppingCart: String,
    ) = println("Заказан товар: $shoppingCart")

    fun addOrder(
        numberOfOrder: String,
        shoppingCart: List<String>,
    ) = println("Заказаны товары: ${shoppingCart.joinToString(", ")}")
}

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.addOrder("1", "Кроссовки")

    order2.addOrder("2", listOf("Куртка", "Шапка"))
}