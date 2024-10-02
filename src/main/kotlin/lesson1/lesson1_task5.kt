package org.example.lesson1

fun main() {
    var secondsOfFlight = 5409
    var minutesOfFlight = 0
    var hoursOfFlight = 0
    while (secondsOfFlight > 60) {
        minutesOfFlight += 1
        secondsOfFlight -= 60
    }
    while (minutesOfFlight > 60) {
        hoursOfFlight += 1
        minutesOfFlight -= 60
    }
    var resultSecondsOfFlight = String.format("%d", secondsOfFlight)
    var resultMinutesOfFlight = String.format("%d", minutesOfFlight)
    var resultHoursOfFlight = String.format("%d", hoursOfFlight)
    if (secondsOfFlight <= 9) resultSecondsOfFlight = String.format("%02d", secondsOfFlight)
    if (minutesOfFlight <= 9) resultMinutesOfFlight = String.format("%02d", minutesOfFlight)
    if (hoursOfFlight <= 9) resultHoursOfFlight = String.format("%02d", hoursOfFlight)
    println("$resultHoursOfFlight:$resultMinutesOfFlight:$resultSecondsOfFlight")
    //На последок хочу сказать, что я пытался этот код сократить воспользываясь разными методами
    //Но, к сожалению, за час поисков ничего лучше не нашел((( Ну хоть этот работает и в нем можно изменять время :O
}