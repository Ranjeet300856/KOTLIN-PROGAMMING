//Q9th
/*
    Write a Kotlin program that takes an integer as input and checks whether the number is a three-digit number.
    A number is considered three-digit if it is between 100 and 999 or -100 and -999.
    If the number is a three-digit number, print:
    The number is a three-digit number
    If the number is not a three-digit number, the program should print nothing.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number! Please Enter a Valid Input")
        return
    }

    if((kotlin.math.abs(number) in 100..999)) println("The number is a three-digit number")
}