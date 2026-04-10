/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Find the maximum sum of a contiguous subarray
    Print the maximum sum 
*/

fun main()
{
    print("Enter size of array: ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid size")
        return
    }

    val arr = IntArray(size)
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter element ${i + 1}: ")
            val element = readln().trim().toIntOrNull()
            if(element == null)
            {
                println("Invalid input! Try again.")
                continue
            }

            arr[i] = element
            break
        }
    }

    // Kadane's Algorithm
    var currentSum = arr[0]
    var maxSum = arr[0]

    for(i in 1 until arr.size)
    {
        val value = arr[i]

        currentSum = if(value > currentSum + value) value else currentSum + value

        if(currentSum > maxSum)
        {
            maxSum = currentSum
        }
    }

    println("Maximum Subarray Sum = $maxSum")
}