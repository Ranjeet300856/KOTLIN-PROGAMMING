/*
    Write a Kotlin program to:
    Create an array of size 10 using Array(){}
    Store the square of each index in the array
    Print all elements of the array 
*/

fun main()
{
    val arr = Array(10) { i -> i * i }
    for(value in arr) print("$value ")
}