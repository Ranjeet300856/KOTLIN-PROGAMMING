//Write a Kotlin program to create an array using arrayOf() and find the second largest element in the array.
fun main() 
{
    val arr = arrayOf(10, 20, 30, 50, 40, 56)
    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for(i in arr) 
    {
        if(i > max)
        {
            secondMax = max
            max = i
        } 
        else if(i > secondMax && i != max)
        {
            secondMax = i
        }
    }

    if(secondMax == Int.MIN_VALUE) println("No second largest element")
    else println("Second Largest = $secondMax")
}