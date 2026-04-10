/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Rearrange the array such that:
    All negative numbers come first
    Then all positive numbers come after
    Maintain the relative order is NOT required
    Print the updated array 
*/

fun main()
{
    print("Enter Array Size : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Input")
        return
    }

    val arr = IntArray(size)
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Element : ")
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

    print("Original Array : ")
    for(value in arr) print("$value ")
    println()

    var start = 0
    var end = arr.size - 1
    while(start < end)
    {
        if(arr[start] < 0) start++
        else if(arr[end] >= 0) end--
        else
        {
            val temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp
            start++
            end--
        }
    }

    print("Rearrange the array : ")
    for(value in arr) print("$value ")
}