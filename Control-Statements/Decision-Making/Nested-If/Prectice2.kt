//Q2nd
/*
    Write a Kotlin program that takes an integer input marks (0 to 100).
    Rules:
    If marks is less than 0 or greater than 100 → print "Invalid Marks"
    Otherwise:
    If marks is 40 or above:
    If marks is 75 or above → print "Distinction"
    Else → print "Pass"
    Else:
    If marks is between 33 and 39 → print "Grace Pass"
    Else → print "Fail"
*/

fun main()
{
    print("Enter Marks : ")
    val marks = readln().trim().toIntOrNull()
    if(marks == null)
    {
        println("Invalid Input!")
        return
    }

    if(marks < 0 || marks > 100)
    {
        println("Invalid Marks")
    }

    else
    {
        if(marks >= 40)
        {
            if(marks >= 75)
            {
                println("Distinction")
            }
            else
            {
                println("Pass")
            }
        }

        else if(marks >= 33 && marks <= 39)
        {
            println("Grace Pass")
        }

        else
        {
            println("Fail")
        }
    }
}