/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Create a new array such that:
    Each element at index i is the product of all elements except itself
    Print the new array 
*/

fun main()
{
    print("Enter Array Size : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Size")
        return
    }

    val arr = IntArray(size)

    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Element ${i + 1}: ")
            val element = readln().trim().toIntOrNull()

            if(element == null)
            {
                println("Invalid Input! Try Again")
                continue
            }

            arr[i] = element
            break
        }
    }

    val left = IntArray(size)
    val right = IntArray(size)
    val result = IntArray(size)

    // Left product
    left[0] = 1
    for(i in 1 until size)
    {
        left[i] = left[i - 1] * arr[i - 1]
    }

    // Right product
    right[size - 1] = 1
    for(i in size - 2 downTo 0)
    {
        right[i] = right[i + 1] * arr[i + 1]
    }

    // Final result
    for(i in arr.indices)
    {
        result[i] = left[i] * right[i]
    }

    print("Product Array: ")
    for(value in result) print("$value ")
}