package org.example.lesson17

private class Folder(
    nameOfFolder: String,
    numberOfFiles: Int,
    private val secretFolder: Boolean
) {
    val nameOfFolder = nameOfFolder
        get() = if (secretFolder) "Cекретно" else field
    val numberOfFiles = numberOfFiles
        get() = if (secretFolder) 0 else field
}

fun main() {
    val folder1 = Folder("Обычная папка", 5, false)
    val folder2 = Folder("Очень секретная папка", 10, true)

    println(folder1.nameOfFolder)
    println(folder1.numberOfFiles)

    println()

    println(folder2.nameOfFolder)
    println(folder2.numberOfFiles)

}