package org.example.lesson2

fun main() {
    val staff: Short = 50
    val salaryStaff = 30000

    val trainee = 30
    val salaryTrainee = 20000

    val expensesOfSalaryStaff = staff * salaryStaff
    val totalExpenses = (staff * salaryStaff) + (trainee * salaryTrainee)

    val totalAverageSalary = totalExpenses / (staff + trainee)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesOfSalaryStaff")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $totalAverageSalary")
}