/*
    Write a Kotlin program to create a 3 × 3 Integer 2D Array and perform the following tasks:

    Create a 3 × 3 matrix using Array.
    Store any integer values manually or dynamically.
    Display the matrix in proper row-column format.
    Calculate and print the Primary Diagonal Sum.
    Calculate and print the Secondary Diagonal Sum. 
*/

fun main()
{
    //Array Creation
    val matrix = Array(3) { row -> Array(3) { col -> (col + (row * 3)) * 3 } }

    //Output
    println("2D Matrix: ")
    for(row in matrix.indices)
    {
        for(col in matrix[row].indices)
        {
            print("${matrix[row][col]}\t")
        }
        println()
    }
    println()

    //Primary and Diagonal Sum
    var primarySum = 0
    var secondarySum = 0
    var lastIndex = matrix.size - 1
    for(i in matrix.indices)
    {
        primarySum += matrix[i][i]                               //Calculate Primary Diagonal Sum
        secondarySum += matrix[i][matrix.size - 1 - i]               //Calculate Secondary Diagonal Sum
        lastIndex--
    }

    println("Primary Diagonal Sum = $primarySum")
    println("Secondary Diagonal Sum = $secondarySum")
}