//Q1st
/*
    Write a Kotlin program that takes an integer input age.
    If age is less than 0 → print "Invalid Age"
    Otherwise:
    If age is 18 or above:
    If age is less than 60 → print "Adult"
    Else → print "Senior Citizen"
    Else:
    If age is between 13 and 17 → print "Teenager"
    Else → print "Child"
*/

fun main()
{
    print("Enter Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null)
    {
        println("Invalid Input!")
        return
    }

    if(age < 0)
    {
        println("Invalid Age")
    }
    else 
    {
        if(age >= 18)
        {
            if(age < 60) 
            {
                println("Adult")
            }
            else
            {
               println("Senior Citizen")
            }
        }

        else if(age >= 13)
        {
            println("Teenager")
        }
        else println("Child")
    }
}