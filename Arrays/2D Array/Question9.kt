/*
    Write a Kotlin program to create a 2D Integer Array using:
    arrayOf(
        IntArray(...),
        IntArray(...),
        IntArray(...)
    )

    Requirements:
    1. Create a 2D Integer array with 3 rows and 4 columns.
    2. Fill rows with these values:
    Row 1 -> 2, 4, 6, 8
    Row 2 -> 1, 3, 5, 7
    Row 3 -> 10, 20, 30, 40

    3. Print the complete matrix row by row.
    4. Print total number of rows.
    5. Print total number of columns.
    6. Print the sum of each row separately..
    7. Print the largest element in whole matrix.
    8. Print all even numbers in one line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOf(
        IntArray(4),
        IntArray(4),
        IntArray(4)
    )

    //Filling Rows
    var odd = 1
    var row2Logic = 10
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            if(row == 0)
                arr[row][col] = (col + 1) * 2
            
            else if(row == 1)
            {
                arr[row][col] = odd
                odd += 2
            }

            else if(row == 2)
            {
                arr[row][col] = row2Logic
                row2Logic += 10
            }
        }
    }

    //Output Array
    println("2D Array: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            print("${arr[row][col]}\t")
        }
        println()
    }
    println()

    println("Total Rows    : ${arr.size}")              //Total Rows
    println("Total Columns : ${arr[0].size}")           //Total Columns
    println()

    var max = arr[0][0]
    for(row in arr.indices)
    {
        var rowSum = 0
        var colSum = 0
        for(col in arr[row].indices)
        {
            val value = arr[row][col]

            rowSum += value                           //Count Row Sum
            if(value > max) max = value      //Find Largest Value
        }
        
        println("Row ${row + 1} Sum    = $rowSum")        //Print Row Sum
    }

    println("Largest Value = $max")                    //Print Largest  Value

    //Even Numbers
    print("Even Numbers : ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            val value = arr[row][col]
            if(value % 2 == 0)
            {
                print("$value ")
            }
        }
    }
    println()
}