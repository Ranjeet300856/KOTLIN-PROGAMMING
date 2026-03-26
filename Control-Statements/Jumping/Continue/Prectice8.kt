//Q8th
/*
    Write a Kotlin program that takes an integer input n from the user.

    Then take n numbers as input from the user.

    Print only those numbers which are:
    - NOT divisible by 2
    - AND NOT divisible by 3

    Use the continue statement to skip unwanted numbers. 
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
        print("Enter your Number${i} : ")
        val x = readln().trim().toIntOrNull()
        if(x == null)
        {
            println("Invalid Input")
            continue
        }

        if(x <= 0)
        {
            println("Please Enter a Valid Integer")
            continue
        }

        if(x % 2 == 0 || x % 3 == 0)
        {
            continue
        }

        println(x)
    }
}