//Write a Kotlin program to create an array using arrayOf() and find the maximum and minimum elements in the array.
fun main()
{
    val arr = arrayOf(50,30,10,20,40,80,70)
    var min = arr[0]
    var max = arr[0]
    for(i in 1 until arr.size)
    {
        if(arr[i] >=  max) max = arr[i]
        if(arr[i] < min) min = arr[i]
    }

    println("Maximum = $max")
    println("Minimum = $min")
}