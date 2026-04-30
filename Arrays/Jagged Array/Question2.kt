/*
    Write a Kotlin program to create a student marks analyzer using a Primitive Jagged Array.
    Different students have different numbers of subjects, so use a Jagged Array where each row stores marks of one student. 
*/

fun inputMarks(arr: Array<IntArray>)
{
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Marks of Student ${row + 1}, Subject ${col + 1} : ")
                val marks = readln().trim().toIntOrNull()
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
}

fun outputAndCalculation(arr: Array<IntArray>)
{
    var highestTotalMarks: Int? = null
    var lowestTotalMarks: Int? = null
    var studentHighestMarks = -1
    var studentLowestMarks = -1
    var grandTotal = 0
    var totalSub = 0

    for(row in arr.indices)
    {
        var totalMarks = 0
        var highestMarks: Int? = null
        var lowestMarks: Int? = null

        totalSub += arr[row].size

        print("Student ${row + 1} Marks : ")
        for(col in arr[row].indices)
        {
            print("${arr[row][col]} ")

            totalMarks += arr[row][col] 

            if(highestMarks == null || arr[row][col] > highestMarks) highestMarks = arr[row][col]
            if(lowestMarks == null  || arr[row][col] < lowestMarks)  lowestMarks = arr[row][col]

            grandTotal += arr[row][col]
        }

        val averageMarks = totalMarks.toDouble() / arr[row].size

        if(highestTotalMarks == null || totalMarks > highestTotalMarks)
        {
            highestTotalMarks = totalMarks
            studentHighestMarks = row + 1
        }

        if(lowestTotalMarks == null || totalMarks < lowestTotalMarks)
        {
            lowestTotalMarks = totalMarks
            studentLowestMarks = row + 1
        }

        println("\nTotal Marks   : $totalMarks")
        println("Average Marks   : %.2f".format(averageMarks))
        println("Highest Mark    : $highestMarks")
        println("Lowest Mark     : $lowestMarks")

        if(averageMarks >= 40) println("Result        : Pass")
        else println("Result        : Fail")

        println()
    }

    val classAvg = grandTotal.toDouble() / totalSub

        println("----------------------------------------\n")
        println("Student with Highest Total Marks : Student $studentHighestMarks ($highestTotalMarks)")
        println("Student with Lowest Total Marks  : Student $studentLowestMarks ($lowestTotalMarks)")
        println("Class Grand Total Marks          : $grandTotal")
        println("Class Average Marks              : %.2f".format(classAvg))
}

fun main()
{
    //Array Creation
    var subjects: Int? = null
    val studentArr = Array(5) { row ->
        while(true)
        {
            print("Enter Total Subjects of Student ${row + 1} : ")
            subjects = readln().trim().toIntOrNull()
            if(subjects == null || subjects <= 0 || subjects > 6)
            {
                println("Invalid Subjects! Try Again")
                continue
            }

            break
        }

        IntArray(subjects)
    }
    println()

    inputMarks(studentArr)                   //Input Marks for Each Student

    println("===== Student Multi-Subject Marks Analyzer =====\n")
    outputAndCalculation(studentArr)         //Calculates - Total Marks, Average Marks, Highest subject mark, Lowest subject mark for each student
}