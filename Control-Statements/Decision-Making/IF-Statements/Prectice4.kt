//Q4th
/*
    Write a Kotlin program that takes an integer as input and checks whether the number is negative.
    If the number is negative, print:
    The number is negative
    If the number is not negative, the program should print nothing.
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

    if(number < 0 ) println("The number is negative")
}