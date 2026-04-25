/*
    Write a Kotlin program to create a 3 × 3 Char 2D Array and perform the following tasks:

    Create a 3 × 3 Char matrix using Array.
    Store characters such as 'X', 'O', and '-' in the board.
    Display the board in proper grid format.
    Count total number of 'X' and 'O'.
    Print whether the center position is empty or occupied. 
*/

fun main()
{
    //Array Creation
    val arr = Array(3) { CharArray(3) }

    //Initialization
    arr[0][0] = 'X'
    arr[0][1] = 'O'
    arr[0][2] = 'X'
    arr[1][0] = '-'
    arr[1][1] = 'O'
    arr[1][2] = '-'
    arr[2][0] = 'X'
    arr[2][1] = '-'
    arr[2][2] = 'O'

    var countX = 0
    var countO = 0
    //Output
    println("Tic Tac Toe Board: ")
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            print("${arr[row][col]} ")

            if(arr[row][col] == 'X') countX++               //Count X
            else if(arr[row][col] == 'O') countO++          //Count O
        }
        println()
    }
    println()

    println("Total X = $countX")
    println("Total O = $countO")

    val centerPos = arr[1][1]
    if(centerPos == '-') println("Center Position = $centerPos (Empty)")
    else println("Center Position = $centerPos (Occupied)")
}