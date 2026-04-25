/*
    Write a Kotlin program to create a 3 × 4 Nullable Integer 2D Array and perform the following tasks:

    Create a 3 × 4 Nullable Int matrix using Array.
    Each position represents a cinema seat:
    null = Empty seat
    Integer value = Customer ID who booked the seat
    Manually assign some customer IDs.
    Display the seating chart:
    Show customer ID if booked
    Show Empty if seat is vacant
    Count total booked seats.
    Count total empty seats.
    Print the customer ID at Row 2, Column 3 (if any). 
*/

fun main()
{
    //Array Creation
    val arr = arrayOf(
        arrayOfNulls<Int>(4),
        arrayOfNulls<Int>(4),
        arrayOfNulls<Int>(4)
    )

    //Input
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Customer ID for Row ${row+1}, Column ${col+1}: ")
                val id = readln().trim()
                if(id.isEmpty())
                {
                    arr[row][col] = null
                    break
                }
                
                val value = id.toIntOrNull()
                if(value != null)
                {
                    arr[row][col] = value
                    break
                }
                else println("Invalid Input! Try Again")
            }
        }
        println()
    }
    println()

    //Output

    var countBooked = 0
    var countEmpty = 0

    println("Cinema Seats: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            if(arr[row][col] == null)
            {
                print("Empty\t")
                countEmpty++                //Count Empty Seat
            }
            else
            {
                print("${arr[row][col]}\t")
                countBooked++               //Count Booked Seat
            }
        }
        println()
    }
    println()

    println("Booked Seats = $countBooked")
    println("Empty Seats  = $countEmpty")
    println("Seat (Row 2, Column 3) = ${arr[1][2] ?: "Empty"}")
}