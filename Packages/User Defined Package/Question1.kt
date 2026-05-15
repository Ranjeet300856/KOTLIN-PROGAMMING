/*
    Question 1 — Basic User Defined Package Creation and Function Access

    Problem Statement
    Create a Kotlin program using a User Defined Package.

    Requirements
    Create a package named: calculator
    Inside this package, create the following functions:
    addition()
    subtraction()

    Both functions should:
    take two integer parameters
    return the result

    Create another Kotlin file for main() function.
    Import the required functions from the package.
    Take two integer inputs from the user.
    Display:
    Addition Result       : value
    Subtraction Result    : value 
*/

import calculator.addition
import calculator.subtraction

fun main()
{
    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()

    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()

    if(number1 == null || number2 == null)
    {
        println("Invalid Input")
        return
    }

    val add = addition(number1, number2)
    val sub = subtraction(number1, number2)

    println("Addition Result    : $add")
    println("Subtraction Result : $sub")
}