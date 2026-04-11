/*
    Write a Kotlin program to create a BooleanArray of size n using BooleanArray() {} such that:
    arr[i] = true if index i is a prime number
    arr[i] = false otherwise

    Then:
    Print the array as true false true ...
    Count how many true values are present.
    Print all indices where value is true. 
*/

fun isPrime(n: Int): Boolean
{
    if(n < 2) return false

    for(i in 2..Math.sqrt(n.toDouble()).toInt())
        if (n % i == 0) return false

    return true
}

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
    val arr = BooleanArray(n) { i -> isPrime(i)  }

    //Count true values
    var count = 0
    for(value in arr) if(value) count++

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    println("True Count : $count")
    print("Prime Indices : ")
    for(i in arr.indices)
        if(arr[i]) print("$i ")   
}