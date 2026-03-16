//Q2nd
/*
    Write a Kotlin program that takes an integer as input and checks whether the number is even or odd.
    If the number is even, print: The number is even 
    Otherwise print: The number is odd
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

    if(number % 2 == 0) println("The number is even")
    else println("The number is odd")
}