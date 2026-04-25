/*
    Write a Kotlin program to create a 2 × 3 Integer 2D Array and perform the following tasks:

    Create a 2 × 3 matrix using Array.
    Store any integer values manually or dynamically.
    Display the original matrix.
    Create and display the transpose of the matrix. 
*/

fun main()
{
    //Original Matrix Creation
    var value = 0
    val matrix = Array(2) { row -> 
        Array(3) { col -> 
            value = value + 10
            value
        } 
    }

    //Output (Original Matrix)
    println("Original Matrix: ")
    for(row in matrix.indices)
    {
        for(col in matrix[row].indices)
        {
            print("${matrix[row][col]} ")
        }
        println()
    }
    println()

    //Transpose Matrix Creation
    val transpose = Array(3) { IntArray(2) }

    //Transpose
    println("Tranpose Matrix: ")
    for(row in transpose.indices)
    {
        for(col in transpose[row].indices)
        {
            transpose[row][col] = matrix[col][row]
            print("${transpose[row][col]} ")
        }
        println()
    }
}