//Q2nd
/*
    Write a Kotlin program to print numbers from 1 to N.
    Terminate the loop if a number divisible by 7 is found.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Invalid Input")
        return
    }

    for(i in 1..number)
    {
        if(i % 7 == 0) break
        print("$i ")
    }
}