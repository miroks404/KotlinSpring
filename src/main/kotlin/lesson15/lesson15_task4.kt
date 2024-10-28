package org.example.lesson15

interface SearchComponents{
    fun searchComponents()
}

class Product(
    val listOfTools: MutableList<Tool> = mutableListOf(),
    val listOfComponents: MutableMap<Tool, Component> = mutableMapOf(),
) {
    fun addTool(tool: Tool) {
        listOfTools.add(tool)
    }

    fun addComponent(nameOfTool: Tool, nameOfComponent: Component) {
        listOfComponents.put(nameOfTool, nameOfComponent)
    }
}

open class Tool(
    val nameOfTool: String,
) : SearchComponents {
    override fun searchComponents() {
        println("Поиск компонентов к $nameOfTool...")
    }
}

class Component(
    val nameOfComponent: String,
)



fun main() {
    val allProducts = Product()

    val tool1 = Tool("Инструмент1")
    val tool2 = Tool("Интсрумент2")
    val tool3 = Tool("Инструмент3")

    val component1 = Component("Комплектующее1")
    val component2 = Component("Комплектующее2")
    val component3 = Component("Комплектующее3")

    allProducts.addTool(tool1)
    allProducts.addTool(tool2)
    allProducts.addTool(tool3)

    allProducts.addComponent(tool1, component2)
    allProducts.addComponent(tool2, component1)
    allProducts.addComponent(tool3, component3)

    tool1.searchComponents()
}