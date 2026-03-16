//Q4th
/*
     Write a Kotlin program that takes two integers as input and determines which number is greater.
     If the first number is greater, print: The first number is greater
     Otherwise print: The second number is greater or equal
*/

fun main()
{
    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(number1 > number2) println("The first number is greater")
    else println("The second number is greater or equal")
}