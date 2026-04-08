/*
    Write a Kotlin program to:
    Create an array of size 10 using Array(){}
    Store:
    Even index → square of index
    Odd index → cube of index
    Print all elements of the array 
*/

fun main()
{
    val arr = Array(10) { i -> if(i % 2 == 0) i * i else i * i * i }
    for(value in arr) print("$value ")
}