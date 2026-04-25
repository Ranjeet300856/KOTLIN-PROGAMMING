/*
    Write a Kotlin program to create a 2D Integer Array using:
    Array(rows) { IntArray(cols) }

    Requirements:
    1. Create a 2D array with 4 rows and 5 columns.
    2. By default, all values should be automatically initialized.
    3. Print the complete matrix row by row.
    4. Print total number of rows.
    5. Print total number of columns.
    6. Print the value present at row 3, column 4.
    7. Print the first row completely.
    8. Print the last row completely. 
*/

fun main()
{
    //Array Creation
    val arr = Array(4) { IntArray(5) }

    //2D Array
    println("2D Array: ")
    for(i in arr.indices)
    {
        for(j in arr[i].indices)
        {
            print("${arr[i][j]} ")
        }
        println()
    }
    println()

    //Print total number of rows and columns.
    println("Total number of rows   : ${arr.size}")
    println("Total number of column : ${arr[0].size}")

    //The value present at row 3, column 4.
    println("Value present at row 3, column 4 : ${arr[2][3]}")

    //Print the first row completely and last row completely.
    print("The first row : ")
    for(i in arr[0].indices)
        print("${arr[0][i]} ")
    
    println()
    
    print("The last row : ")
    for(i in arr[arr.size - 1].indices) 
        print("${arr[arr.size -1][i]} ")
}