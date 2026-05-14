/*
    Write a Kotlin program that analyzes student marks using Arrays and Kotlin predefined packages.

    Your program should:

    Take marks of 5 students as input.
    Store marks using an Array.
    Display:
    All Marks
    Highest Marks
    Lowest Marks
    Average Marks
    Total Marks
    Count:
    Passed Students (Marks >= 40)
    Failed Students (Marks < 40)
    Display marks in:
    Ascending Order
    Descending Order
    Print a professional report. 
*/

fun main()
{
    //Marks Array Creation
    val marks = IntArray(5) { 0 }

    //Input Marks
    for(i in marks.indices)
    {
        while(true)
        {
            print("Enter Marks of Student ${i + 1} : ")
            val input = readln().trim().toIntOrNull()
            if(input == null || input < 0 || input > 100)
            {
                println("Invalid Input")
                continue
            }

            marks[i] = input
            break
        }
    }

    //Calculation and Output
    var totalMarks = 0
    var highestMarks = marks[0]
    var lowestMarks = marks[0]
    var passed = 0
    var failed = 0
    val ascending = marks.sortedArray()
    val descending = marks.sortedArrayDescending()

    println("\n-------- Student Marks Report --------\n")

    print("All Marks        : ")
    for(value in marks)
    {
        print("$value ")
        
        totalMarks += value
        if(value > highestMarks) highestMarks = value
        if(value < lowestMarks) lowestMarks = value
        if(value >= 40) passed++
        if(value < 40) failed++
    }

    val averageMarks = totalMarks.toDouble() / marks.size

    println("\nHighest Marks    : $highestMarks")
    println("Lowest Marks     : $lowestMarks")
    println("Average Marks    : %.2f".format(averageMarks))
    println("Total Marks      : $totalMarks")
    println("Ascending Order  : ${ascending.joinToString()}")
    println("Descending Order : ${descending.joinToString()}")
    println("Passed Students  : $passed")
    println("Failed Students  : $failed")
}