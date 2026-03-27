//Q6th
/*
    Write a Kotlin function that takes an integer n as input and:

    If n is less than or equal to 0 → return "Invalid Input"
    Iterate from 1 to n
    If any number is divisible by 7, immediately return "Found"
    If loop completes without finding any such number → return "Not Found" 
*/

fun divisibleBySeven(n: Int): String
{
    if(n <= 0) return "Invalid Input"
    for(i in 1..n)
    {
        if(i % 7 == 0) return "Found"
    }

    return "Not Found"
}

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    println(divisibleBySeven(number))
}