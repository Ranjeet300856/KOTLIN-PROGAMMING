//Write a Kotlin program to create an array using arrayOf() and count how many even and odd numbers are present in the array.
fun main()
{
    val arr = arrayOf(1,2,3,4,5,6,7,8)
    var evenCount = 0
    var oddCount = 0
    for(i in 0 until arr.size)
    {
        if(arr[i] % 2 == 0) evenCount++
        else oddCount++
    }

    println("Even count = $evenCount")
    println("Odd count = $oddCount")
}