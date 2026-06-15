/*
    Question 2 — Employee Salary Calculator (Basic → Intermediate Level)
    Problem Statement
    Create a Kotlin program that calculates an employee's annual salary using a Trailing Lambda.

    Requirements
    Create a Higher Order Function named calculateAnnualSalary.
    The function should accept:
    Monthly salary (Int)

    A lambda parameter that receives the monthly salary and returns Unit.
    Use Trailing Lambda Syntax while calling the function.
    Inside the lambda:
    Display the monthly salary.
    Calculate and display the annual salary.

    Use meaningful function and variable names.
    The program should work correctly for valid salary values. 
*/

fun calculateAnnualSalary(salary: Int, calculator: (Int) -> Unit) = calculator(salary)

fun main()
{
    print("Enter Monthly Salary : ")
    val monthlySalary = readln().trim().toIntOrNull()
    if(monthlySalary == null || monthlySalary <= 0)
    {
        println("Invalid Input")
        return
    }

    calculateAnnualSalary(monthlySalary) {
        salary: Int ->
        println("Monthly Salary : $salary")
        println("Annual Salary  : ${salary * 12}")
    } 
}