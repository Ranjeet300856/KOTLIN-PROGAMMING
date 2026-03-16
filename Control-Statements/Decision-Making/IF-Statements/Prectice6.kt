//Q6th
/*
    Write a Kotlin program that takes an integer as input and checks whether the number is a multiple of 10.        
    If the number is a multiple of 10, print:
    The number is a multiple of 10
    If the number is not a multiple of 10, the program should print nothing.
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

    if(number % 10 == 0) println("The number is a multiple of 10")
}