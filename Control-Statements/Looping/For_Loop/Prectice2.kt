//Q2nd
/*
    Write a Kotlin program to print all even numbers from 1 to N using a for loop.
    Also count how many even numbers are present in this range.
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

    var count = 0
    print("Even Numbers: ")
    for(i in 2..n step 2)
    {
        print("$i ")
        count++
    }

    println()
    println("Count: $count")
}