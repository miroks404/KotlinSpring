package org.example.lesson19

private enum class Category {
    CLOTHES {
        override fun getCategory() = "Одежда"
    },
    STATIONERY {
        override fun getCategory() = "Канцелярские товары"
    },
    OTHER {
        override fun getCategory() = "Разное"
    };

    abstract fun getCategory(): String
}

private class Product(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun getInfo() {
        println(
            """
            -Название: $name
            -Id: $id
            -Категория: ${category.getCategory()}
        """.trimIndent()
        )
    }
}

fun main() {
    val product1 = Product("Куртка", 1, Category.CLOTHES)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Салфетки", 3, Category.OTHER)

    product1.getInfo()

    println()

    product2.getInfo()

    println()

    product3.getInfo()
}