/*
    Write a Kotlin program to create a 4 × 3 Integer 2D Array and perform the following tasks:

    Create a 4 × 3 matrix using Array.
    Store any integer values manually or dynamically.
    Display the matrix in proper row-column format.
    Calculate and print the sum of each column separately. 
*/

fun main()
{
    //Array Creation
    val matrix = Array(4) { row -> Array(3) { col -> row + col } }

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

    //Sum of Each Column
    for(col in matrix[0].indices)
    {
        var sum = 0
        for(row in matrix.indices)
        {
            val value = matrix[row][col]
            sum += value
        }

        println("Column ${col + 1} Sum = $sum")
    }
}