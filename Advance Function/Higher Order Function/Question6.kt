/*
    Question 6 — Dynamic Array Analyzer Using Function as Parameter
    Problem Statement - Create a Kotlin program that analyzes an integer array using different analysis functions passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically execute different array operations. 
*/

fun findMaximum(arr: IntArray): Int
{
    var max = arr[0]
    for(value in arr)
        if(value > max) max = value
    
    return max
}

fun findMinimum(arr: IntArray): Int
{
    var min = arr[0]
    for(value in arr)
        if(value < min) min = value
    
    return min
}

fun findSum(arr: IntArray): Int
{
    var sum = 0
    for(value in arr)
        sum += value
    
    return sum
}

fun analyzeArray(arr: IntArray, operation: (IntArray) -> Int): Int = operation(arr)

fun main()
{
    print("Enter size of array : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Size")
        return
    }
    
    println()
    val arr = IntArray(size)
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Element ${i + 1} : ")
            val value = readln().trim().toIntOrNull()
            if(value == null)
            {
                println("Invalid Element! Try Again")
                continue
            }

            arr[i] = value
            break
        }
    }

    print("\nOriginal Array : ")
    for(value in arr) print("$value ")

    val max = analyzeArray(arr, ::findMaximum)
    val min = analyzeArray(arr, ::findMinimum)
    val sum = analyzeArray(arr, ::findSum)

    println("\n")
    println("Maximum Value : $max")
    println("Minimum Value : $min")
    println("Sum of Elements : $sum")
}