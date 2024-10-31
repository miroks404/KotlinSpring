package org.example.lesson20

fun main() {
    val happyNewYear: (String) -> Unit = {username: String -> println("С наступающим Новым Годом, $username!")}
    happyNewYear("miroks404")
}