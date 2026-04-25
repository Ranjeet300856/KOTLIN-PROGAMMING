/*
    Write a Kotlin program to create a 3 × 2 String 2D Array and perform the following tasks:

    Create a 3 × 2 String matrix using Array.
    Store student names in the matrix.
    Display all names in proper row-column format.
    Print the total number of students.
    Print the name present at Row 2, Column 1. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { arrayOfNulls<String?>(2) }

    //Input Elements
    for(i in arr.indices)
    {
        for(j in arr[i].indices)
        while(true)
        {
            print("Enter Student Name ${j + 1} of Row ${i + 1} : ")
            val name = readln().trim()

            if(name.isEmpty())
            {
                arr[i][j] = null 
                break
            }

            else if(name.all { it.isLetter() || it.isWhitespace() } )
            {
                arr[i][j] = name
                break
            }

            else println("Invalid Name! Try Again")
        }
    }
    println()

    var count = 0               //varible count declare for count students
    //Output
    println("Student Name Matrix: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            print("${arr[row][col]}\t\t")

            if(arr[row][col] != null) count++               //Count Students
        }
        println()
    }
    println()

    println("Total Students = $count")
    println("Name at Row 2 Column 1 = ${arr[1][0]}")
}