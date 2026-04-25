/*
    Write a Kotlin program to create a 2D String Array using:
    Array(rows) { row ->
        Array(cols) { col ->
            logic
        }
    }

    Requirements:
    1. Create a 3 rows and 4 columns String array.
    2. Fill each cell using this logic: "R${row+1}C${col+1}"
    3. Matrix should look like:
    R1C1 R1C2 R1C3 R1C4
    R2C1 R2C2 R2C3 R2C4
    R3C1 R3C2 R3C3 R3C4

    4. Print the complete matrix row by row.
    5. Print the value present at row 2, column 4.
    6. Print total number of rows.
    7. Print total number of columns.
    8. Print the complete second row. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { row -> Array(4) { col -> "R${row + 1}C${col + 1}" } }

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
 
    println("The value present at row 2, column 4 : ${arr[1][3]}")         //Value present at row 2, column 4
    println("Total Number of Rows    : ${arr.size}")                       //Total Number of Rows
    println("Total Number of Columns : ${arr[0].size}")                   //Total Number of Columns

    //Second Row
    print("Second Row : ")
    for(col in arr[1].indices)
    {
        print("${arr[1][col]} ")
    }
}