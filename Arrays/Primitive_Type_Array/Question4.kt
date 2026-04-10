/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Create a new array such that:
    If the element is even → store its square
    If the element is odd → store its cube
    Print the new array 
*/

fun main()
{
    print("Enter Size of Array : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Input")
        return
    }

    val arr = LongArray(size)
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Element ${i + 1} : ")
            val element = readln().trim().toLongOrNull()
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

    val arr2 = LongArray(size)
    for(i in arr.indices)
    {
        val value = arr[i]
        if(value % 2 == 0L) arr2[i] = value * value
        else arr2[i] = value * value * value
    }

    print("New Array : ")
    for(value in arr2) print("$value ")
}