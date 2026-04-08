/*
    Write a Kotlin program to:

    Create an array of size 10 using Array(){}
    Store numbers from 1 to 10 in the array
    Create a new array using Array(){} such that:
    If index is even → store sum of all elements from 0 to i (inclusive)
    If index is odd → store product of current element and previous element
    Print both arrays 
*/

fun main()
{
    val arr1 = Array(10) { i -> i + 1 }
    var runningSum = 0
    val arr2 = Array(10) { i ->
        runningSum += arr1[i]
        if(i % 2 == 0) runningSum
        else
        {
            val current = arr1[i]
            val previous = arr1[i - 1]
            current * previous
        }
    }

    print("Original Array : ")
    for(value in arr1) print("$value ")
    println()

    print("Result Array : ")
    for(value in arr2) print("$value ")
}