package org.example.lesson21

fun main() {
    val text: String = "hello"
    println(text.vowelCount())
}

fun String.vowelCount() : Int {
    val allVowelChars: List<Char> = listOf('a', 'e', 'i', 'o', 'u')
    var vowelCount: Int = 0
    for(i in this) {
        if (i in allVowelChars) {
            vowelCount += 1
        }
    }
    return vowelCount
}