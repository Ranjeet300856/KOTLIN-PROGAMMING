//Q7th
/*
    Check if a number is greater than 100
    Write a Kotlin program that takes an integer as input and checks whether the number is greater than 100.
    If the number is greater than 100, print:
    The number is greater than 100
    If the number is 100 or less, the program should print nothing.
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

    if(number > 100) println("The number is greater than 100")
}