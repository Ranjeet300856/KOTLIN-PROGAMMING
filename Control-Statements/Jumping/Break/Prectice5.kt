//Q5th
/*
    Write a Kotlin program to calculate the sum of numbers from 1 onwards.
    Stop adding numbers when the sum exceeds 50 using break.
*/

fun main()
{
    var sum = 0
    var i = 1
    while(true)
    {
        sum += i
        if(sum > 50)
        {
            println("Sum exceeded 50 at i = $i")
            break
        }
        i++
    }

    println("i = $i, Sum = $sum")
}