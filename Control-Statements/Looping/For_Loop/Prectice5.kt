//Q5th
/*
    Write a Kotlin program to calculate the factorial of a given number N using a for loop.
*/

fun main()
{
    print("Enter a Number: ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n < 0)
    {
        println("Invalid Input")
        return
    }
    if(n == 0)
    {
        println("Factorial: ${1}")
        return
    }

    var factorial = 1L
    print("Factorial: ")
    for(i in 1..n)
    {
        factorial *= i
    }

    println("$factorial")
}