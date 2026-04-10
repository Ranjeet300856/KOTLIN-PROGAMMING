/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size) of size 5
    Take input from user and store values in the array
    Print all elements of the array using index-based loop
    Print the sum of all elements 
*/

fun main()
{
    val arr = IntArray(5)
    var sum = 0
    for(i in 0 until arr.size)
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
        
        sum += arr[i]
    }

    print("Array elements: ")
    for(i in arr.indices)
    {
        print("${arr[i]} ")
    }

    println()
    println("Sum = $sum")
}