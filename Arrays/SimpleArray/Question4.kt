/*
    Write a Kotlin program to create an array using arrayOf() 
    and print the elements of the array in reverse order without using any built-in reverse functions. 
*/

fun main()
{
    val arr = arrayOf(50,40,10,30,20)
    var start = 0
    var end = arr.size - 1
    while(start < end)
    {
        var temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }

    for(i in 0 until arr.size)
    {
        print("${arr[i]} ")
    }
}