//Q3rd
/*
    Write a Kotlin program that takes an integer input n from the user.
    Print numbers from 1 to n,
    but skip all numbers that are divisible by 3 or 5 using the continue statement. 
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
        if(i % 3 == 0 || i % 5 == 0)
        {
            continue
        }

        print("$i ")
    }
}