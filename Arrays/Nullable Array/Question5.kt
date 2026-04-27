/*
    Write a Kotlin program to create a Nullable Boolean Array using arrayOfNulls().

    Scenario:
    A company stores attendance status of 10 employees.

    Requirements:
    1. Create a nullable Boolean array of size 10 using arrayOfNulls().
    2. Fill some indexes with:
       true  = Present
       false = Absent
       null  = Not Updated Yet
    3. Print all elements with index.
    4. Count Present employees.
    5. Count Absent employees.
    6. Count Not Updated employees.
    7. Print first updated status index.
    8. Print last updated status index.
    9. Print all indexes where employee is Present.
    10. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOfNulls<Boolean>(10)

    //Input
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Employee Attendance ${i+1} (Present/Absent/Not Updated Yet) : ")
            val input = readln().trim().lowercase()
            if(input == "present")
            {
                arr[i] = true
                break
            }

            else if(input == "absent")
            {
                arr[i] = false
                break
            }

            else if(input == "not updated yet")
            {
                arr[i] = null
                break
            }

            else
            {
                println("Invalid Input! Try Again") 
                continue
            }
        }
    }

    //Print Array with index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var countPresent = 0
    var countAbsent = 0
    var countNotUpdate = 0
    var firstUpdated = -1
    var lastUpdated = -1

    for(i in arr.indices)
    {
        when(arr[i])
        {
            true -> countPresent++
            false -> countAbsent++
            null -> countNotUpdate++
        }

        if(arr[i] != null)
        {
            if(firstUpdated == -1) firstUpdated = 0
            lastUpdated = i
        }

    }

    println("Present           = $countPresent")
    println("Absent            = $countAbsent")
    println("Not Updated Count = $countNotUpdate")
    println()
    println("First Updated Index = $firstUpdated")
    println("Last Updated Index  = $lastUpdated")
    println()

    //Print Present Employee Indexes
    print("Present Employee Indexes : ")
    for(i in arr.indices)
        if(arr[i] == true) print("$i ")
    println()

    //Final Array
    print("Final Array : ")
    for(value in arr) print("$value ")
}