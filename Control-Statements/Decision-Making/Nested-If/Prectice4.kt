//Q4th
/*
    Write a Kotlin program that calculates electricity bill based on units consumed.
    Rules:
    If units is less than 0 → print "Invalid Units"
    Otherwise:
    If units ≤ 100:
    If units ≤ 50 → bill = units × 1
    Else → bill = units × 2
    Else (units > 100):
    If units ≤ 200 → bill = units × 3
    Else → bill = units × 5
*/

fun main()
{
    print("Enter Total Units : ")
    val units = readln().trim().toIntOrNull()
    if(units == null)
    {
        println("Invalid Input")
        return
    }

    var bill = 0
    if(units < 0)
    {
        println("Invalid Units")
        return
    }
    else
    {
        if(units <= 100)
        {
            if(units <= 50)
            {
                bill = units * 1
            }
            else 
            {
                bill = units * 2
            }
        }
        else 
        {
            if(units <= 200)
            {
                bill = units * 3
            }
            else
            {
                bill = units * 5
            }
        }
    }

    println("Total Bill: $bill")
}