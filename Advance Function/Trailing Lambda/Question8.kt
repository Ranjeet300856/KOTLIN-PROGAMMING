/*
    Question 8 — Employee Bonus Eligibility System (Advanced Level)
    Problem Statement
    Create a Kotlin program that determines an employee's bonus eligibility using a Trailing Lambda with multiple normal parameters.

    Requirements
    Create a Higher Order Function named evaluateEmployee.
    The function should accept:
    Employee name (String)
    Years of experience (Int)
    A lambda parameter that:
    Receives both values
    Returns a String

    The Higher Order Function must return the value returned by the lambda.
    Use Trailing Lambda Syntax while calling the function.

    Display:
    Employee Name
    Years of Experience
    Eligibility Result 
*/

fun evaluateEmployee(name: String, year: Int, checkEligibility: (String, Int) -> String): String = checkEligibility(name, year)

fun main()
{
    print("Enter Employee Name : ")
    val employeeName = readln().trim()
    print("Enter Experience    : ")
    val experienceYear = readln().trim().toIntOrNull()
    if(employeeName.isBlank() || experienceYear == null || experienceYear < 0)
    {
        print("Invalid Input")
        return
    }

    val eligibility = evaluateEmployee(employeeName, experienceYear) {
        name: String, year: Int ->

        when {
            year >= 10 -> "Eligible for Platinum Bonus"
            year >= 5 -> "Eligible for Gold Bonus"
            year >= 2 -> "Eligible for Silver Bonus"
            else -> "Not Eligible"
        }
    }

    println("Employee Name       : $employeeName")
    println("Experience          : $experienceYear")
    println("Result              : $eligibility")
}