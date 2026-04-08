/*
    Write a Kotlin program to:
    Create an array of size 10 using Array(){}
    Store numbers from 1 to 10 in the array
    Create a new array using Array(){} where:
    If the number is even → store its half
    If the number is odd → store its double
    Print both arrays 
*/

fun main()
{
    val arr1 = Array(10) { i -> i + 1 }
    val arr2 = Array(10) { i -> if(arr1[i] % 2 == 0) arr1[i] / 2 else arr1[i] * 2 }

    print("Original Array : ")
    for(value in arr1) print("$value ")
    println()

    print("Transformed Array : ")
    for(value in arr2) print("$value ")
}