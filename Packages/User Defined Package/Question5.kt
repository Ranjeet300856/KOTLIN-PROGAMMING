/*
    Question 5 — Alias Import (as) in User Defined Package
    Problem Statement
    Create a Kotlin program that demonstrates the use of Alias Import (as) in Kotlin User Defined Packages.

    Requirements
    1. Create TWO different packages
    Package 1 - geometry
    Create function: calculate()
    This function should: take side of square
    return area of square

    Package 2 - physics
    Create function: calculate()
    This function should: take mass and acceleration
    return force

    2. Create another Kotlin file for main() function
    3. Use Alias Import
    You MUST use:
    import geometry.calculate as areaCalculator
    import physics.calculate as forceCalculator

    4. Take input from the user
    Take:
    side of square
    mass
    acceleration

    5. Display Output
    Area of Square : value
    Force Value    : value
*/

import geometry.calculate as areaCalculator
import physics.calculate as forceCalculator

fun main()
{
    print("Enter Side of Square : ")
    val side = readln().trim().toIntOrNull()
    if(side == null || side <= 0)
    {
        println("Invalid Input")
        return
    }

    print("Enter Mass : ")
    val mass = readln().trim().toIntOrNull()
    print("Enter acceleration : ")
    val acceleration = readln().trim().toIntOrNull()
    if(mass == null || mass <= 0 || acceleration == null)
    {
        println("Invalid Input")
        return
    }

    println("Area of Square : ${areaCalculator(side)}")
    println("Force Value    : ${forceCalculator(mass, acceleration)}")
}