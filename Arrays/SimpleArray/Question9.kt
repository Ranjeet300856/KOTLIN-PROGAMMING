/*
    Write a Kotlin program to create an array using arrayOf() 
    and move all zero elements to the end of the array while maintaining the order of non-zero elements.
*/

fun main() 
{
    val arr = arrayOf(0, 10, 0, 20, 30, 0, 40)
    var index = 0

    // Step 1: move non-zero elements forward
    for(i in 0 until arr.size) 
    {
        if(arr[i] != 0) 
        {
            arr[index] = arr[i]
            index++
        }
    }

    // Step 2: fill remaining with zeros
    while(index < arr.size) 
    {
        arr[index] = 0
        index++
    }

    // Print result
    for(i in arr.indices) 
    {
        print("${arr[i]} ")
    }
}