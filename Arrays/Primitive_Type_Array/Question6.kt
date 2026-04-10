/*
    Write a Kotlin program to:

    Create an integer array using IntArray(size)
    Take input from user to fill the array
    Count the frequency of each element in the array
    Print each element with its frequency 
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

    for(i in arr.indices)
    {
        var isVisited = false
        for(k in 0 until i) 
        {
            if(arr[i] == arr[k]) 
            {
                isVisited = true
                break
            }
        }

        if(isVisited) continue

        var countFrequency = 0
        for(j in arr.indices)
        {
            if(arr[i] == arr[j]) countFrequency++
        }

        println("${arr[i]} -> $countFrequency times")
    }
}