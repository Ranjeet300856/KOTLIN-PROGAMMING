/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:
    arr[i] = i×(n−1−i)
    Each element is the product of the index and its mirror distance.

    Then:
    Print the array.
    Find and print the maximum value in the array.
    Print the first index where the maximum value occurs. 
*/

fun main()
{
    print("Enter Array Size : ")
    val n = readln().trim().toIntOrNull()

    //Input Validation
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    //Array Creation
    val arr = IntArray(n) { i -> i * (n - 1 - i) }

    //Find Maximum Value
    var firstMaxIndex = 0
    var max = arr[0]
    for(i in 1 until arr.size)
    {
        if(arr[i] > max)
        {
            max = arr[i]
            firstMaxIndex = i
        }
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("Maximum Value : $max")
    println("First Index of Maximum : $firstMaxIndex")
}