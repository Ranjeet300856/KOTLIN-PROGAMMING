//Q3rd
/*
Write a Kotlin program that takes a student's marks as input.
If the marks are 40 or greater, print: The student has passed
Otherwise print: The student has failed
*/

fun main()
{
    print("Enter Marks : ")
    val marks = readln().trim().toIntOrNull()
    if(marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(marks >= 40) println("The student has passed")
    else println("The student has failed!")
}