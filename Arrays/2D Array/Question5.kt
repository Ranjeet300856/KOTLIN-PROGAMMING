/*
    Write a Kotlin program to create a 2D String Array using:
    arrayOf(
        Array(cols) { ... },
        Array(cols) { ... },
        ...
    )

    Requirements:
    1. Create a 2D String array with 3 rows and 4 columns.
    2. Fill the rows with the following data:
    Row 1 -> A, B, C, D
    Row 2 -> E, F, G, H
    Row 3 -> I, J, K, L

    3. Print the complete matrix row by row.
    4. Print the value present at row 2, column 3.
    5. Print total number of rows.
    6. Print total number of columns.
    7. Print the first column completely.
    8. Print the last column completely.
*/

fun main()
{
    //Array Creation
    val arr = arrayOf(
        Array(4) { col1 -> "${'A' + col1}" },
        Array(4) { col2 -> "${'E' + col2}" },
        Array(4) { col3 -> "${'I' + col3}" }
    )

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

    println("The value present at row 2, column 3 : ${arr[1][2]}")       //The value present at row 2, column 3
    println("Total Number of Rows    : ${arr.size}")                      //Total Number of Rows
    println("Total Number of Columns : ${arr[0].size}")                  //Total Number of Columns

    print("First Column : ")                                           //Print First Column
    for(row in arr.indices)
    {
        print("${arr[row][0]} ")
    }
    println()

    print("Last Column : ")                                          //Print Last Column
    for(row in arr.indices)
    {
        print("${arr[row][arr[0].size - 1]}")
    }
}