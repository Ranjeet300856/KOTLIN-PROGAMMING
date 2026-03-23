//Q6th
//Write a Kotlin program using a while loop to check whether a given number is an Armstrong number or not.
import kotlin.math.pow
fun main()
{
    print("Enter a Number : ")
    var number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    if(number == 0)
    {
        println("Armstrong")
        return
    }

    if(number < 0)
    {
        println("Not Armstrong")
        return
    }

    
    val originalNumber = number

    // Step 1: Count digits
    var temp = number
    var count = 0
    while(temp != 0)
    {
        temp /= 10
        count++
    }

    // Step 2: Calculate Armstrong sum
    temp = number
    var sum = 0
    while(temp != 0)
    {
        val digit = temp % 10
        sum += digit.toDouble().pow(count).toInt()
        temp /= 10
    }

    // Step 3: Compare
    if(sum == originalNumber) println("Armstrong")
    else println("Not Armstrong")
}