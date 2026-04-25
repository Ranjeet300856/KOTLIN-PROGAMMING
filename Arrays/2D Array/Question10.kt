/*
    Write a Kotlin program to create a 3 × 3 Integer 2D Array and perform the following tasks:

    Create a 3 × 3 matrix using Array.
    Manually store values from 1 to 9 in the matrix.
    Display the matrix in proper row-column format.
    Print total number of rows and columns separately. 
*/

fun main()
{
    //Array Creation
    var value = 1
    val arr = Array(3) { row -> Array(3) { col -> value++ } }

    //Output
    println("2D Matrix is: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            print("${arr[row][col]} ")
        }
        println()
    }
    println()

    println("Total Rows    : ${arr.size}")              //Display total rows
    println("Total Columns : ${arr[0].size}")           //Display total columns
}