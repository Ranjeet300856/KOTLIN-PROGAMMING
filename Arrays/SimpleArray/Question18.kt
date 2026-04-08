/*
    Write a Kotlin program to:

    Create an array of size 10 using Array(){}
    Store numbers from 1 to 10 in the array
    Create a new array using Array(){} such that:
    If element is divisible by 5 → store 0
    Else if element is even → store element / 2
    Else → store element * 3
    Print both arrays 
*/

fun main()
{
    val arr1 = Array(10) { i -> i + 1 }
    val arr2 = Array(10) { i ->
        if(arr1[i] % 5 == 0) 0
        else if(arr1[i] % 2 == 0) arr1[i] / 2
        else arr1[i] * 3
    }

    print("Original Array : ")
    for(value in arr1) print("$value ")
    println()

    print("Result Array : ")
    for(value in arr2) print("$value ")
}