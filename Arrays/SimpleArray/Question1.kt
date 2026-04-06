//Write a Kotlin program to create an array using arrayOf() and calculate the sum and average of all elements.
fun main()
{
    val arr = arrayOf(10, 20, 30, 40, 50)
    var sum = 0
    for(i in 0 until arr.size)
    {
        sum += arr[i]
    }

    val average = sum.toDouble() / arr.size
    println("Sum = $sum")
    println("Average = $average")
}