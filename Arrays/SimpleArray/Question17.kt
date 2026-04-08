/*
    Write a Kotlin program to:
    Create an array of size 10 using Array(){}
    Store numbers from 1 to 10 in the array
    Create a new array using Array(){} such that:
    If index is divisible by 3 → store square of element
    Otherwise → store negative of element
    Print both arrays
*/

fun main()
{
    val arr1 = Array(10) { i -> i + 1 }
    val arr2 = Array(10) { i -> if(i % 3 == 0) arr1[i] * arr1[i] else -arr1[i] }

    print("Original Array : ")
    for(value in arr1) print("$value ")
    println()

    print("Result Array : ")
    for(value in arr2) print("$value ")
}