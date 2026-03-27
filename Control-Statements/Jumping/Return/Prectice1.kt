//Q1st
/*
    Write a Kotlin function that takes an integer n as input and:

    If n is negative, return "Invalid Input"
    If n is 0, return "Zero"
    If n is even, return "Even"
    If n is odd, return "Odd" 
*/

fun numberIs(n: Int): String
{
    if(n < 0) return "Invalid Input"
    if(n == 0) return "Zero"
    if(n % 2 == 0) return "Even"
    else return "Odd"
}

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number ==  null)
    {
        println("Invalid Input")
        return
    }

    println(numberIs(number))
}