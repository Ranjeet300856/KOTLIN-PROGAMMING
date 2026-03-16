//Q7th
/*
    Check whether a number is divisible by both 3 and 5
    Write a Kotlin program that takes an integer as input.
    If the number is divisible by both 3 and 5, print:
    The number is divisible by both 3 and 5
    Otherwise print:
    The number is not divisible by both 3 and 5
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

    if(number % 3 == 0 && number % 5 == 0) println("The number is divisible by both 3 and 5")
    else println("The number is not divisible by both 3 and 5")
}