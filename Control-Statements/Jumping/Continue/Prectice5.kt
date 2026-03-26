//Q5th
/*
    Write a Kotlin program that takes an integer input n from the user.

    Then take n numbers as input from the user.

    Print only the positive numbers,
    but skip all negative numbers and zero using the continue statement. 
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    if(number <= 0)
    {
        println("Please Enter a Positive Integer")
        return
    }

    for(i in 1..number)
    {
        print("Enter your number${i} : ")
        val x = readln().trim().toIntOrNull()
        if(x == null)
        {
            println("Invalid Input")
            continue
        }

        if(x <= 0)
        {
            continue
        }
        print("$x ")
        println()
    }
}