/*
    Write a Kotlin program to create a 2D Nullable Integer Array using:
    Array(rows) { arrayOfNulls<Int>(cols) }

    Requirements:
    1. Create a 2D nullable Integer array with 3 rows and 4 columns.
    2. By default, all values should be null.
    3. Manually store some values
    4. Print the complete matrix row by row.
    5. Wherever value is null, print "Empty".
    6. Print total number of rows.
    7. Print total number of columns.
    8. Count total null cells.
    9. Count total non-null cells. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { arrayOfNulls<Int>(4) }

    //Values Input
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Element ${col + 1} of Row ${row + 1} : ")
                val element = readln().trim()
                if(element.isEmpty())
                {
                    arr[row][col] = null
                    break
                }

                val num = element.toIntOrNull()
                if(num != null)
                {
                    arr[row][col] = num
                    break
                }

                else println("Invalid Input! Try Again")
            }
        }
    }
    println()

    var nullCell = 0
    var nonNullCell = 0
    //Output Array
    println("2D Array: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            if(arr[row][col] == null)
            {
                print("Empty ")
                nullCell++
                continue
            }

            print("${arr[row][col]} ")
            nonNullCell++
        }
        println()
    }
    println()

    println("Total Number of Rows       : ${arr.size}")           //Total Number of Rows
    println("Total Number of Columns    : ${arr[0].size}")       //Total Number of Columns
    println("Count Null Cell            : $nullCell")           //Null Cells
    println("Count Non Null Cell        : $nonNullCell")        //Non Null Cells
}