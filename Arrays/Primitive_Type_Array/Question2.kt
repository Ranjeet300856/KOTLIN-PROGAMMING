/*
    Write a Kotlin program to:

    Create an integer array using intArrayOf() with initial values
    Find the maximum and minimum element in the array
    Print both values 
*/

fun main()
{
    val arr = intArrayOf(40,20,50,30,10,50)
    var max = arr[0]
    var min = arr[0]

    for(i in 1 until arr.size)
    {
        if(arr[i] > max) max = arr[i]
        if(arr[i] < min) min = arr[i]
    }

    print("Array elements: ")
    for(value in arr) print("$value ")

    println()
    println("Maximum = $max")
    println("Minimum = $min")
}