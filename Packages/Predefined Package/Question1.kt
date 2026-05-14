//Write a Kotlin program that performs multiple mathematical operations using Kotlin predefined packages.

import kotlin.math.*
fun main()
{
    //Input Number and Validation
    print("Enter a Number : ")
    val number = readln().trim().toDoubleOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    //Calculation and Output

    println("\n------ Math Report ------\n")

    if(number >= 0) println("Square Root    : %.2f".format(sqrt(number)))
    if(number >= 0) println("Cube Root      : %.2f".format(cbrt(number)))
    println("Absolute Value : ${abs(number)}")
    println("Rounded Value  : ${round(number)}")
    println("Floor Value    : ${floor(number)}")
    println("Ceiling Value  : ${ceil(number)}")
    println("Power of 2     : ${number.pow(2)}")
}