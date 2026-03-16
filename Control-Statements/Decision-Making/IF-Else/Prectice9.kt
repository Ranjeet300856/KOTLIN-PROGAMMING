//Q9th
/*
    Check whether a number is a multiple of 7
    Write a Kotlin program that takes an integer as input.
    If the number is a multiple of 7, print:
    The number is a multiple of 7
    Otherwise print:
    The number is not a multiple of 7
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

    if(number % 7 == 0) println("The number is a multiple of 7")
    else println("The number is not a multiple of 7")
}