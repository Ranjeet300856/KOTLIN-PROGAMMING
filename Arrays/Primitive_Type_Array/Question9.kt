/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    The array contains n-1 distinct numbers from 1 to n
    Find the missing number in the array
    Print the missing number 
*/

fun main()
{
    print("Enter Array Size : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 1)
    {
        println("Invalid Size")
        return
    }

    val arr = IntArray(n - 1)
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

    val expectedSum = n * (n + 1) / 2

    var actualSum = 0
    for(value in arr)
    {
        actualSum += value
    }

    val missing = expectedSum - actualSum
    println("Missing Number = $missing")
}