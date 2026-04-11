/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:
    arr[i] = min(i,n−1−i)
    Each element stores the distance from the nearest edge of the array.

    Then:
    Print the array.
    Find and print the maximum value in the array.
    Count how many times the maximum value occurs. 
*/

import kotlin.math.min
fun main()
{
    print("Enter Size of Array : ")
    val n = readln().trim().toIntOrNull()

    //Input Validation
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    //Array Creation
    val arr = IntArray(n) { i ->  min(i, n - 1 - i) }

    //Counting
    var max = arr[0]
    var count = 1
    for(i in 1 until arr.size)
    {
        if(arr[i] > max)
        {
            max = arr[i]
            count = 1
        }
        else if(arr[i] == max) count++
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("Maximum Value : $max")
    println("Frequency of Maximum : $count")
}