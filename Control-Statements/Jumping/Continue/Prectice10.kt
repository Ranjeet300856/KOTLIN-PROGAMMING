//Q10th
/*
    Write a Kotlin program that takes an integer input n from the user.
    Then take n numbers as input from the user.

    For each number:
    - Skip the number if it is negative (use continue)
    - If the number is divisible by both 3 and 5, stop the entire loop (use break)
    - Otherwise, print the square of the number 
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number")
        return
    }

    if(number <= 0)
    {
        println("Please Enter a Valid Positive Integer")
        return
    }

    for(i in 1..number)
    {
        print("Enter Number${i} : ")
        val x = readln().trim().toIntOrNull()
        if(x == null)
        {
            println("Invalid Input")
            continue
        }

        if(x < 0) continue
        if(x % 3 == 0 && x % 5 == 0) break
        println("${x * x}")
    }
}