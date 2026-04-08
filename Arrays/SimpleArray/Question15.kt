/*
    Write a Kotlin program to:
    Create an array of size 10 using Array(){}
    Store numbers from 1 to 10 in the array
    Create a new array using Array(){} that stores elements of the first array in reverse order
    Print both arrays 
*/

fun main()
{
    val arr1 = Array(10) { i -> i + 1 }
    val arr2 = Array(10) { i -> arr1[arr1.size - 1 - i] }
    print("Original Array : ")
    for(value in arr1) print("$value ")
    println()

    print("Reversed Array : ") 
    for(value in arr2) print("$value ")
}