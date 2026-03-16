//Q8th
/*
    Write a Kotlin program that takes an integer as input.
    If the number is between 1 and 100 (inclusive), print:
    The number is within the valid range
    Otherwise print:
    The number is outside the valid range
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(number in 1..100) println("The number is within the valid range")
    else println("The number is outside the valid range")
}