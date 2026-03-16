//Q1st
/*
    Check if a number is positive
    Write a Kotlin program that takes an integer number and checks whether the number is positive.
    If the number is positive, print:
    The number is positive
    If the number is not positive, the program should print nothing.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number! Please Enter a Valid Integer")
        return
    }

    if(number > 0) println("Number is Positive")
}