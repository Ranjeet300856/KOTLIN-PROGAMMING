/*
    Write a Kotlin program to:

    Create an array of size 10 using Array(){}
    Store numbers from 1 to 10 in the array
    Create a new array using Array(){} such that:
    Each element = sum of current element + previous element
    For index 0, just store the same element (no previous element)
    Print both arrays 
*/

fun main()
{
    val arr1 = Array(10) { i -> i + 1 }
    val arr2 = Array(10) { i ->
        if(i == 0) arr1[0]
        else
        {
            val current = arr1[i]
            val previous = arr1[i - 1]

            current + previous
        }
    }

    print("Original Array : ")
    for(value in arr1) print("$value ")
    println()

    print("Result Array : ")
    for(value in arr2) print("$value ")
}