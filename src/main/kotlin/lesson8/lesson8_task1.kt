package org.example.lesson8

fun main() {
    val numberOfAds = intArrayOf(11, 16, 12, 15, 13, 11, 9)

    println(
        "Всего просмотров за неделю: ${
            numberOfAds[0] + numberOfAds[1] + numberOfAds[2] + numberOfAds[3] +
                    numberOfAds[4] + numberOfAds[5] + numberOfAds[6]
        }"
    )
}