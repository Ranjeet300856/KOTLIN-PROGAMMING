/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} where each element is initialized using the formula:
    arr[i]=i∗2
    Then:
    Print the entire array.
    Print the sum of all elements.
    Print the maximum value in the array. 
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
    val arr = IntArray(n) { i -> i * 2 }

    //Calculate Sum and Max
    var sum = 0
    var max = arr[0]
    for(i in arr.indices)
    {
        if(arr[i] > max) max = arr[i]
        sum += arr[i]
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()
    println("Sum : $sum")
    println("Max : $max")
}
