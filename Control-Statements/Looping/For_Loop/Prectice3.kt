//Q3rd
/*
    Write a Kotlin program to print all odd numbers from 1 to N using a for loop.
    Also calculate and print the sum of all odd numbers in this range.
*/

fun main()
{
    print("Enter a Number : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    var sum = 0
    print("Odd Numbers: ")
    for(i in 1..n step 2)
    {
        print("$i ")
        sum += i
    }

    println()
    println("Sum: $sum")
}