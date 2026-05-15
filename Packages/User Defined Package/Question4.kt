/*
    Question 4 — Wildcard Import (*) in User Defined Package

    Problem Statement
    Create a Kotlin program that demonstrates the use of Wildcard Import (*) with a User Defined Package.
    Requirements
    1. Create a package named: mathutils
    2. Inside this package, create THREE different functions
    Function 1
    square()
    take one integer parameter
    return square of the number

    Function 2
    cube()
    take one integer parameter
    return cube of the number

    Function 3
    factorial()
    take one integer parameter
    return factorial of the number

    3. Create another Kotlin file for main() function
    4. Use Wildcard Import
    5. Take one integer input from the user
    6. Display Output
    Square Value     : value
    Cube Value       : value
    Factorial Value  : value 
*/

import mathutils.*

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }
    
    println("Square Value     : ${square(number)}")
    println("Cube Value       : ${cube(number)}")

    if(number < 0)
    {
        println("Factorial is not defined for negative numbers.")
        return
    }
    println("Factorial Value  : ${factorial(number)}")
}