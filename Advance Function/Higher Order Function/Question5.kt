/*
    Question 5 — Dynamic Salary Processor Using Function as Parameter
    Problem Statement - Create a Kotlin program that processes employee salary using different salary operations passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically execute different salary calculations. 
*/

fun calculateBonus(salary: Double): Double = salary + (salary * 10) / 100
fun calculateTax(salary: Double): Double = salary - (salary * 5) / 100
fun calculateInsuranceDeduction(salary: Double): Double = salary - (salary * 2) / 100

fun processSalary(salary: Double, process: (Double) -> Double): Double = process(salary)

fun main()
{
    print("Enter Employee Salary : ")
    val salary = readln().trim().toDoubleOrNull()
    if(salary == null || salary <= 0)
    {
        println("Invalid Salary")
        return
    }

    val calculateBonus = processSalary(salary, ::calculateBonus)
    val calculateTax = processSalary(salary, ::calculateTax)
    val calculateInsuranceDeduction = processSalary(salary, ::calculateInsuranceDeduction)

    println("Original Salary                  : %.2f".format(salary))
    println("Salary After Bonus               : %.2f".format(calculateBonus))
    println("Salary After Tax Deduction       : %.2f".format(calculateTax))
    println("Salary After Insurance Deduction : %.2f".format(calculateInsuranceDeduction))
}