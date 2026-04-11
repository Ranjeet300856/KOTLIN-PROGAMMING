/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:
    If the index i is even, then
    arr[i] = i ^ 2

    If the index i is odd, then
    arr[i] = −i

    Then:
    Print the array.
    Count how many positive, negative, and zero values are present.
    Print the counts. 
*/

fun main()
{
    print("Enter Array Size : ")
    val n = readln().trim().toIntOrNull()

    //Input Validation
    if(n == null || n <= 0)
    {
        println("Invalid Size")
        return
    }

    //Array Creation
    val arr = IntArray(n) { i -> if(i % 2 == 0) i * i else -i }

    //Counting
    var countPositive = 0
    var countNegative = 0
    var countZero = 0
    for(value in arr)
    {
        if(value == 0) countZero++
        else if(value < 0) countNegative++
        else countPositive++
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("Positive Count : $countPositive")
    println("Negative Count : $countNegative")
    println("Zero Count     : $countZero")
}