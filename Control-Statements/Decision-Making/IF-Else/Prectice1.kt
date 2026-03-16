//Q1st
/*
    Write a Kotlin program that takes an integer as input and checks whether the number is positive or negative.
    If the number is positive, print: The number is positive
    Otherwise print: The number is negative
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(number > 0) println("The number is positive")
    else println("The number is negative")
}