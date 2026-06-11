/*
    Question 5 — Custom Array Modifier using Higher Order Function and Lambda

    Problem Statement
    Create a Kotlin program where:
    You create a Higher Order Function named modifyArray.
    The function should:
    take an IntArray
    take one Lambda parameter for modification
    The Lambda should modify every element of the array.
    Operations to Perform

    Call the Higher Order Function using different Lambdas for:
    Double Every Element
    Triple Every Element
    Square Every Element
    Convert Negative Numbers to Positive
*/

import kotlin.math.abs

fun modifyArray(arr: IntArray, modification: (IntArray) -> IntArray): IntArray = modification(arr)

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

    println("\nEnter Array Elemetns:\n")
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

    val doubleArray = {
        array: IntArray ->
        val newArray = IntArray(array.size)

        for(i in array.indices)
        {
            val value = array[i]
            newArray[i] = value * 2
        }

        newArray
    }

    val tripleArray = {
        array: IntArray ->
        val newArray = IntArray(array.size)

        for(i in array.indices)
        {
            val value = array[i]
            newArray[i] = value * 3
        }

        newArray
    }

    val squareArray = {
        array: IntArray ->
        val newArray = IntArray(array.size)

        for(i in array.indices)
        {
            val value = array[i]
            newArray[i] = value * value
        }

        newArray
    }

    val negativeToPositive = {
        array: IntArray ->
        val newArray = IntArray(array.size)

        for(i in array.indices)
            newArray[i] = abs(array[i])
        
        newArray
    }

    print("\nOriginal Array: ")
    for(value in arr) print("$value ")
    println("\n")

    val double_arr = modifyArray(arr, doubleArray)
    print("Double Array   : ")
    for(value in double_arr) print("$value ")
    println()

    val triple_arr = modifyArray(arr, tripleArray)
    print("Triple Array   : ")
    for(value in triple_arr) print("$value ")
    println()

    val square_arr = modifyArray(arr, squareArray)
    print("Square Array   : ")
    for(value in square_arr) print("$value ")
    println()

    val positive_arr = modifyArray(arr, negativeToPositive)
    print("Positive Array   : ")
    for(value in positive_arr) print("$value ")
    println()
}