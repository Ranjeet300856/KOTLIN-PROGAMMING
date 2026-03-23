//Q4th
/*
    Write a Kotlin program to print all natural numbers from N to 1 (in reverse order) using a for loop.
*/

fun main()
{
    print("Enter a Number: ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    print("Reverse Numbers: ")
    for(i in n downTo 1)
    {
        print("$i ")
    }
}