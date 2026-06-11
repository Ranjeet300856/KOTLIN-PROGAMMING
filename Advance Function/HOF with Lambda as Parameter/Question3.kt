/*
    Question 3 — Array Statistics Analyzer using Higher Order Function and Lambda
    Problem Statement

    Create a Kotlin program where:

    You create a Higher Order Function named analyzeArray.
    The function should:
    take an IntArray
    take one Lambda parameter for analysis
    The Lambda should perform different operations on the array.
    Operations to Perform

    Call the Higher Order Function using different Lambdas for:
    Find Maximum Element
    Find Minimum Element
    Find Sum of All Elements
    Find Average of Elements 
*/

fun analyzeArray(arr: IntArray, operation: (IntArray) -> Int): Int = operation(arr)

fun main()
{
    print("Enter Array Size : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Size Input")
        return
    }

    val arr = IntArray(size)

    println("Enter Array Elements: \n")
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Element ${i + 1} : ")
            val element = readln().trim().toIntOrNull()
            if(element == null)
            {
                println("Invalid Element! Try Again")
                continue
            }

            arr[i] = element
            break
        }
    }

    val findMax = { array: IntArray -> 

        var max = array[0]
        for(value in array)
            if(value > max) max = value
        
        max
    }

    val findMin = { array: IntArray -> 

        var min = array[0]
        for(value in array)
            if(value < min) min = value
        
        min
    }

    val calculateSum = { array: IntArray ->

        var sum = array[0]
        for(value in arr)
            sum += value
        
        sum
    }

    val calculateAverage = { array: IntArray -> calculateSum(array) / array.size }

    print("\nOriginal Array : ")
    for(value in arr) print("$value ")
    println()

    println("Maximum Value : ${analyzeArray(arr, findMax)}")
    println("Minimum Value : ${analyzeArray(arr, findMin)}")
    println("Sum           : ${analyzeArray(arr, calculateSum)}")
    println("Average       : ${analyzeArray(arr, calculateAverage)}")
}