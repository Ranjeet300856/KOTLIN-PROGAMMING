/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:
    Each element represents the absolute distance from the middle index of the array.
    arr[i] = |i−mid|
    Where:
    mid = n / 2 (integer division)

    Then:
    Print the array.
    Find and print the minimum value in the array.
    Count how many times the minimum value occurs. 
*/

import kotlin.math.abs
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
    val mid = n / 2
    val arr = IntArray(n) { i -> abs(i - mid) }

    // Find Minimum and its Frequency
    var min = arr[0]
    var count = 1
    for(i in 1 until arr.size) 
    {
        if(arr[i] < min) 
        {
            min = arr[i]
            count = 1
        } 
        else if(arr[i] == min) count++
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("Minimum Value : $min")
    println("Frequency of Minimum : $count")
}