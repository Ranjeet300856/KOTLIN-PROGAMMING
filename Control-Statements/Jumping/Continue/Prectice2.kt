//Q2nd
/*
    Write a Kotlin program that takes an integer input n from the user.
    Print all numbers from 1 to n,
    but skip all even numbers using the continue statement.
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
        println("Please Enter a Natural Number")
        return
    }

    for(i in 1..number)
    {
        if(i % 2 == 0)
        {
            continue
        }

        print("$i ")
    }
}