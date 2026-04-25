/*
    Write a Kotlin program to create a 3 × 4 Integer 2D Array and perform the following tasks:

    Create a 3 × 4 matrix using Array.
    Store any integer values manually in the matrix.
    Display the matrix in proper row-column format.
    Calculate and print the sum of each row separately. 
*/

fun main()
{
    //Array Creation
    val matrix = Array(3) { row -> Array(4) { col -> (row * 2) + col } }

    //Output
    println("2D Matrix: ")
    for(row in matrix.indices)
    {
        for(col in matrix[row].indices)
        {
            print("${matrix[row][col]} ")
        }
        println()
    }
    println()

    //Sum of Each Rows
    for(row in matrix.indices)
    {
        var sum = 0
        for(col in matrix[row].indices)
        {
            val value = matrix[row][col]
            sum += value
        }
        println("Sum of Row ${row + 1} : $sum")
    }
}