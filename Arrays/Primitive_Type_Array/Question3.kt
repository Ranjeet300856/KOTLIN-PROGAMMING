/*
    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Reverse the array without using any built-in function
    Print the reversed array 
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

    print("Original Array : ")
    for(value in arr) print("$value ")

    var start = 0
    var end = arr.size - 1
    while(start < end)
    {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        
        start++
        end--
    }

    println()
    print("Reversed Array : ")
    for(value in arr) print("$value ")
}