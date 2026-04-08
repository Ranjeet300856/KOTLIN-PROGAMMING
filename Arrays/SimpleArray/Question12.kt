/*
    Write a Kotlin program to:
    Create an array of size 10 using Array(){}
    Store even numbers only in the array starting from 0
    Print all elements of the array 
*/

fun main()
{
    val arr = Array(10) { i -> i * 2 }
    for(value in arr) print("$value ")
}