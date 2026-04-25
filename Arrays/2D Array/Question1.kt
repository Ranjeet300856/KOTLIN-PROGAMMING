/*
    Write a Kotlin program to create a 2D Integer Array using Primitive Array

    Requirements:
    1. Create a 2D array with 3 rows and 3 columns.
    2. Store the following values:
    1 2 3
    4 5 6
    7 8 9

    3. Print the complete matrix row by row.
    4. Print the value present at row 2, column 3.
    5. Print total number of rows.
    6. Print total number of columns. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )

    //Array Output
    println("2D Array = ")
    for(i in arr.indices)
    {
        for(j in arr[i].indices)
            print("${arr[i][j]} ")
        
        println()
    }
    println()

    //The value present at row 2, column 3.
    val row2Col3 = arr[1][2]
    println("The value present at row 2, column 3 = $row2Col3")

    //Total number of rows. and Total number of columns.
    println("Number of Rows = ${arr.size}")
    println("Number of Columns = ${arr[0].size}")
}