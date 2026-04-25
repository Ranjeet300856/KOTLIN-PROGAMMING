/*
    Write a Kotlin program to create a 3 × 4 Double 2D Array and perform the following tasks:

    Create a 3 × 4 Double matrix using Array.
    Store marks of 3 students in 4 subjects.
    Display the marks sheet in row-column format.
    Calculate and print the average marks of each student.
    Print the highest mark in the whole matrix. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { DoubleArray(4) }

    //Input Marks
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Marks ${col + 1} of Student ${row + 1} : ")
                val marks = readln().trim().toDoubleOrNull()
                if(marks == null || marks < 0 || marks > 100)
                {
                    println("Invalid Marks! Try Again")
                    continue
                }

                arr[row][col] = marks
                break
            }
        }
        println()
    }
    println()

    //Output
    println("Marks Sheet: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            print("%.2f\t".format(arr[row][col]))
        }
        println()
    }
    println()

    //Calculate Average
    var average = 0.0
    var max = arr[0][0]             //Declare for find highest marks

    for(row in arr.indices)
    {
        var total = 0.0
        for(col in arr[row].indices)
        {
            total += arr[row][col]                              //Count Total Marks
            if(arr[row][col] > max) max = arr[row][col]         //Find Max. Marks
        }

        average = total / arr[row].size      //Calculate Average

        println("Student ${row + 1} Average = %.2f".format(average))
    }
    println()

    println("Highest Mark = $max")
}