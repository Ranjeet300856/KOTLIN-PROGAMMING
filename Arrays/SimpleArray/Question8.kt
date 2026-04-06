//Write a Kotlin program to create an array using arrayOf() and check whether the array is sorted in ascending order or not.
fun main()
{
    val arr = arrayOf(10, 20, 30, 40, 50)
    var isSorted = true
    for(i in 0 until arr.size - 1)
    {
        if(arr[i] > arr[i + 1])
        {
            isSorted = false
            break
        }
    }

    if(isSorted) println("Array is sorted")
    else println("Array is not sorted")
}