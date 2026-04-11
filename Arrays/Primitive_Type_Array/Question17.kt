/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:
    arr[i] = i/2

    Then:
    Print the array.
    Find and print the sum of all elements.
    Count how many distinct values are present. 
*/

fun main()
{
    print("Enter Size of Array : ")
    val size = readln().trim().toIntOrNull()

    //Input Validation
    if(size == null || size <= 0)
    {
        println("Invalid Input")
        return
    }

    //Array Creation
    val arr = IntArray(size) { i -> i / 2 }

    //Sum of all elements and count distinct values
    var sum = 0
    var count = 1
    var x = arr[0]
    for(value in arr)
    {
        sum += value
        if(x != value)
        {
            count++
            x = value
        }
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("Sum : $sum")
    println("Distinct Values : $count")
}