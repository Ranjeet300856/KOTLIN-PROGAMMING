/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:

    For even indices i → arr[i]=i+1
    For odd indices i → arr[i]=−(i+1)

    Then:
    Print the array.
    Find and print the sum of elements at even indices only.
    Find and print the sum of elements at odd indices only. 
*/

fun main()
{
    print("Enter Array Size : ")
    val n = readln().trim().toIntOrNull()

    //Input Validation
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    //Array Creation
    val arr = IntArray(n) { i -> if(i % 2 == 0) i + 1 else -(i + 1) }

    //Calculate Even, Odd Sum
    var evenSum = 0
    var oddSum = 0
    for(i in arr.indices)
    {
        if(i % 2 == 0) evenSum += arr[i]
        else oddSum += arr[i]
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("Even Index Sum : $evenSum")
    println("Odd Index Sum  : $oddSum")
}