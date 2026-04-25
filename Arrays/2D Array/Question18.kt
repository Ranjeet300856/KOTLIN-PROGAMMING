/*
    Write a Kotlin program to create a 4 × 5 Boolean 2D Array and perform the following tasks:

    Create a 4 × 5 Boolean matrix using Array.
    Each position represents a seat:
    true = Booked
    false = Empty
    Manually mark some seats as booked.
    Display the seat chart in readable format:
    B for Booked
    E for Empty
    Count total booked seats.
    Count total empty seats.
    Check whether seat at Row 3, Column 4 is booked or empty. 
*/

fun main()
{
    //Array Creation
    val arr = Array(4) { BooleanArray(5) }

    //Input
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Seat Status of Row ${row + 1}, Column ${col + 1}: ")
                val status = readln().trim().lowercase()

                if(status.isEmpty() || status == "empty")
                {
                    arr[row][col] = false
                    break
                }

                else if(status.all { it.isLetter()} && status == "booked")
                {
                    arr[row][col] = true
                    break
                }

                else println("Invalid Input! Try Again")
            }
        }
        println()
    }
    println()

    //Output and Counting
    var countBooked = 0
    var countEmpty = 0
    println("Seat Chart: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            val value = arr[row][col]
            if(value)
            {
                print("B ")
                countBooked++               //Count Booked Seats
            }
            else
            {
                print("E ")
                countEmpty++                //Count Empty Seats
            }
        }
        println()
    }
    println()

    println("Booked Seats = $countBooked")
    println("Empty Seats = $countEmpty")
    
    if(arr[2][3] == true) println("Seat (Row 3, Column 4) = Booked")
    else println("Seat (Row 3, Column 4) = Empty")
}