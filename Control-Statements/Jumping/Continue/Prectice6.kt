//Q6th
/*
    Write a Kotlin program that takes an integer input n from the user.
    Print numbers from 1 to n.
    But:
    - Skip numbers divisible by 3 using continue
    - Stop the loop completely if a number divisible by 7 is found (use break)
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        print("Invalid Input")
        return
    }

    if(number <= 0)
    {
        println("Please Enter a Valid Positive Integer")
        return
    }

    for(i in 1..number)
    {
        if(i % 7 == 0) 
        {
            break
        }
        if(i % 3 == 0)
        {
            continue
        }

        print("$i ")
    }
}