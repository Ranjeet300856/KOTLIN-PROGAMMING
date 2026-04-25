/*
    Write a Kotlin program to create a 2D Nullable Integer Array using:
    Array(rows) {
        Array<Int?>(cols) { null }
    }

    Requirements:
    1. Create a 3 rows and 3 columns nullable array.
    2. Fill only diagonal cells with values:
    10, 20, 30
    3. Keep remaining cells null.
    4. Print full matrix row by row.
    5. Print null cells as X.
    6. Print total null cells.
    7. Print total filled cells.
    8. Print diagonal sum. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { Array<Int?>(3) { null } }

    //Array Elements Fill
    var x = 10
    for(i in arr.indices)
    {
        arr[i][i] = x
        x += 10
    }

    //Output Array
    var nullCell = 0
    var filledCell = 0
    var sum = 0
    println("2D Array: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            if(arr[row][col] == null)
            {
                print("X\t")
                nullCell++
                continue
            }
            print("${arr[row][col]}\t")

            val value = arr[row][col]
            if(value != null) sum += value

            filledCell++
        }
        println()
    }
    println()

    println("Total Null Cells   : $nullCell")             //Total Null Cells
    println("Total Filled Cells : $filledCell")         //Total Filled Cells
    println("Diagonal Sum       : $sum")                //Diagonal Sum
}