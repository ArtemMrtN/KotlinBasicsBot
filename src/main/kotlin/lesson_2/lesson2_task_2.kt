package org.example.lesson_2

fun main() {

    val totalNumberEmployees = 50
    val salaryEmployees = 30000
    val totalNumberIntern = 20
    val salaryIntern = 20000

    val paymentToEmployees = totalNumberEmployees * salaryEmployees
    val paymentToAll = totalNumberEmployees * salaryEmployees + totalNumberIntern * salaryIntern
    val averageSalary = paymentToAll / (totalNumberEmployees + totalNumberIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников: $paymentToEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $paymentToAll")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}