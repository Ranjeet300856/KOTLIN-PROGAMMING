//Q9th
/*
    Write a Kotlin program to print the following number triangle pattern using for loops.
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
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

    for(i in 1..n)
    {
        for(j in 1..i)
        {
            print("$j ")
        }
        println()
    }
}