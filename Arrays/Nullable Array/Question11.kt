/*
    Write a Kotlin program to create a Nullable Int Array using arrayOfNulls().

    Scenario:
    A cinema hall has 12 fixed seats.
    Each seat stores:
    null = Empty Seat
    Any Integer = Customer ID who booked that seat

    Requirements:
    1. Create a nullable Int array of size 12 using arrayOfNulls().
    2. Manually assign customer IDs to some seats.
    3. Keep some seats null.
    4. Print all seats with index.
    5. Count booked seats.
    6. Count empty seats.
    7. Print first empty seat index.
    8. Print last booked seat index.
    9. Check if Customer ID 105 exists or not.
    10. Print all booked customer IDs.
    11. Print all empty seat indexes.
    12. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOfNulls<Int>(12)

    //Input
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Customer ID ${i + 1} : ")
            val customerID = readln().trim()
            if(customerID.isEmpty())
            {
                arr[i] = null
                break
            }
            if(customerID.all { it.isDigit() })
            {
                arr[i] = customerID.toInt()
                break
            }
            else println("Invalid Input! Try Again")
        }
    }
    println()

    //Print All Seats with Index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var countBookedSeat = 0
    var countEmptySeat = 0
    var firstEmptySeat = -1
    var lastBookedSeat = -1
    var seat105Found = false
    var customer105Exists = -1

    for(i in arr.indices)
    {
        if(arr[i] == null)
        {
            countEmptySeat++        //Count Empty Seat
            if(firstEmptySeat == -1) firstEmptySeat = i     //First Empty Seat Index
            continue
        }

        countBookedSeat++           //Count Booked Seat
        lastBookedSeat = i          //Last Booked Seat Index

        if(arr[i] == 105)        //Check Customer ID 105 exists or not
        {
            seat105Found = true
            customer105Exists = i
        }
    }
    println()

    println("Count Booked Seat      = $countBookedSeat")
    println("Count Empty Seat       = $countEmptySeat")
    println("First Empty Seat Index = $firstEmptySeat")
    println("Last Booked Seat Index = $lastBookedSeat")

    if(seat105Found)
        println("Customer ID ${105} is Exist at $customer105Exists Index")
    else 
        println("Customer ID ${105} is not Exist\n")
    
    //Print all booked customer IDs
    print("All booked customer IDs : ")
    for(value in arr)
        if(value != null) print("$value ")
    println()

    //Print all empty seat indexes
    print("All empty seat indexes : ")
    for(i in arr.indices)
        if(arr[i] == null) print("$i ")
    println()

    //Final Array
    print("Final Array : ")
    for(value in arr) print("$value ")
}