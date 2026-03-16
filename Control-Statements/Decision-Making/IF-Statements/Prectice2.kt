//Q2nd
/*
    Check if a number is divisible by 5
    Write a Kotlin program that takes an integer as input and checks whether the number is divisible by 5.
    If the number is divisible by 5, print:
    The number is divisible by 5
    If the number is not divisible by 5, the program should print nothing.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(number % 5 == 0) println("The number is divisible by 5")
}