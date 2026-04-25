/*
    Write a Kotlin program to create a 2D Integer Array using:
    Array(rows) { row ->
        IntArray(cols) { col ->
            logic
        }
    }

    Requirements:
    1. Create a 2D array with 4 rows and 4 columns.
    2. Fill values using this logic: value = rowIndex + colIndex
    3. Print the complete matrix row by row.
    4. Print the value present at row 4, column 4.
    5. Print total number of rows.
    6. Print total number of columns.
    7. Print the diagonal elements.
    8. Print the sum of first row. 
*/

fun main()
{
    //Array Creation
    val arr = Array(4) { row -> IntArray(4) { col -> row + col }  }

    //Output Array
    println("2D Array: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            print("${arr[row][col]} ")
        }
        println()
    }
    println()

    println("Value present at row 4, column 4 : ${arr[3][3]}")      //The value present at row 4, column 4
    println("Total number of rows : ${arr.size}")                   //Total number of rows
    println("Total number of columns : ${arr[0].size}")             //// Total number of columns
    println()

    //Printing the diagonal elements
    print("Diagonal elements : ")
    for(i in arr.indices) print("${arr[i][i]} ")
    println()

    //Sum of First Row
    var sum = 0
    for(i in arr[0].indices) sum += arr[0][i]
    println("Sum of First Row : $sum")
}