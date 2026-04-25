/*
    Write a Kotlin program to create a 2D Nullable String Array using:
    Array(rows) { Array<String?>(cols) { null } }

    Requirements:
    1. Create a 2D nullable String array with 3 rows and 3 columns and Fill names manually.
    2. Print the complete matrix row by row.
    3. Wherever value is null, print "Empty".
    4. Print total number of rows.
    5. Print total number of columns.
    6. Count total null cells.
    7. Count total filled cells.
    8. Print all non-null names in one line. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { Array<String?>(3) { null } }

    //Input Values
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {           
                print("Enter Name ${col + 1} of Row ${row + 1} : ")
                val name = readln().trim()
                if(name.isEmpty())
                {
                    arr[row][col] = null
                    break
                }
                else if(name.all { it.isLetter() || it.isWhitespace() })
                {
                    arr[row][col] = name
                    break
                }
                else println("Invalid Input! Try Again")
            }
        }
        println()
    }
    println()

    //Output Array
    var countNullCell = 0
    var countFilledCell = 0

    println("2D Array: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            if(arr[row][col] == null)
            {
                print("Empty\t")
                countNullCell++     //Count Null Cells
                continue
            }

            print("${arr[row][col]}\t")
            countFilledCell++               //Count Filled Cells
        }
        println()
    }
    println()

    println("Total Rows         : ${arr.size}")              //Total Rows
    println("Total Columns      : ${arr[0].size}")           //Total Columns
    println("Total Null Cells   : $countNullCell")          //Total Null Cells
    println("Total Filled Cells : $countFilledCell")        //Total Filled Cells
    println()

    //All non-null names in one line
    print("Names in One Line : ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            if(arr[row][col] != null)
            {
                print("${arr[row][col]} ")
            }
        }
    }
}