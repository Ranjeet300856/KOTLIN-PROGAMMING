/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Find the second largest element in the array
    Print the result 
*/

fun main()
{
    print("Enter Array Size : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 1)
    {
        println("Invalid Input")
        return
    }

    val arr = IntArray(size)
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

    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    for(value in arr) 
    {
        if(value > first) 
        {
            second = first
            first = value
        }
        else if(value < first && value > second) second = value
    }

    if(second == Int.MIN_VALUE) println("No second largest element found.")
    else println("Second Largest = $second")
}