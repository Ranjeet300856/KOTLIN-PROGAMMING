//Q7th
//Write a Kotlin program using a while loop to find the sum of digits of a given number.
import kotlin.math.abs
fun main()
{
    print("Enter a Number : ")
    var number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number")
        return
    }

    if(number == 0)
    {
        println("Sum of Digits = 0")
        return
    }

    number = abs(number)
    var sum = 0
    while(number != 0)
    {
        var lastNumber = number % 10
        sum += lastNumber
        number /= 10
    }

    println("Sum of Digits = $sum")
}