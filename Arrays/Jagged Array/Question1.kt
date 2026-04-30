/*
    Write a Kotlin program to create an employee weekly work-hours dashboard using a Simple Jagged Array.
    Different employees worked different numbers of days in a week, so use a Jagged Array where each row stores daily work hours of one employee. 
*/

fun main()
{
    //Array Creation
    
    var size: Int? = null
    val arr = Array(5) { row ->
        while(true)
        {
            print("Enter Days of Employee ${row + 1} : ")
            size = readln().trim().toIntOrNull()
            if(size == null || size <= 0)
            {
                println("Invalid Days! Try Again")
                continue
            }
            break
        }

        DoubleArray(size)
    }
    println()

    //Input Hours
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Hours of Employee ${row + 1}, Day ${col + 1} : ")
                val hour = readln().trim().toDoubleOrNull()
                if(hour == null || hour < 0 || hour > 24)
                {
                    println("Invalid Hours! Try Again")
                    continue
                }

                arr[row][col] = hour
                break
            }
        }
        println()
    }
    println()

    //Counting and Calculate Average and Output

    var highest: Double? = null
    var lowest: Double? = null
    var employeeHighestWork: Int? = null
    var employeeLowestWork: Int? = null
    var grandTotal = 0.0

    println("===== Employee Weekly Work Hours Dashboard =====\n")

    for(row in arr.indices)
    {
        var count = 0.0

        print("Employee ${row + 1} Hours: ")
        for(col in arr[row].indices)
        {
            print("%.2f ".format(arr[row][col]))

            count += arr[row][col]
            grandTotal += arr[row][col]
        }

        val avg = count / arr[row].size

        if(highest == null || count > highest)
        {
            highest = count
            employeeHighestWork = row + 1
        }

        if(lowest == null || count < lowest)
        {
            lowest = count
            employeeLowestWork = row + 1
        }

        println("\nTotal Hours   : %.2f".format(count))
        println("Average Hours : %.2f".format(avg))
        println()
    }
    println()

    println("----------------------------------------\n")

    println("Employee with Highest Total Hours : Employee $employeeHighestWork ($highest Hours)")
    println("Employee with Lowest Total Hours  : Employee $employeeLowestWork ($lowest Hours)")
    println("Grand Total Hours of All Employees: $grandTotal")
}