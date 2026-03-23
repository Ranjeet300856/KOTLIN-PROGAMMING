//Q7th
/*
    Write a Kotlin program to print a right-angled triangle star pattern using for loops.
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
            print("* ")
        }
        println()
    }
}