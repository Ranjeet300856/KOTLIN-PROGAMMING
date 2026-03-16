//Q10th
/*
    Write a Kotlin program that takes two integers as input and calculates the absolute difference between them.
    If the first number is greater than the second, print:
    The absolute difference is: (first - second)
    Otherwise print:
    The absolute difference is: (second - first)
*/

fun main()
{
    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(number1 > number2) println("The absolute difference is: ${number1 - number2}")
    else println("The absolute difference is: ${number2 - number1}")
}