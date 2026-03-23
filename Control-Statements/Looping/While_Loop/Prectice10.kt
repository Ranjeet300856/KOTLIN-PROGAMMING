//Q10th
//Write a Kotlin program using a while loop to find the Greatest Common Divisor (GCD) of two numbers.
import kotlin.math.abs

fun main()
{
    print("Enter first number (A): ")
    val aInput = readln().trim().toIntOrNull()
    print("Enter second number (B): ")
    val bInput = readln().trim().toIntOrNull()
    if(aInput == null || bInput == null)
    {
        println("Invalid Input")
        return
    }

    var a = abs(aInput)
    var b = abs(bInput)

    // Edge case
    if(a == 0)
    {
        println("GCD = $b")
        return
    }

    if(b == 0)
    {
        println("GCD = $a")
        return
    }

    // Euclidean Algorithm
    while(b != 0)
    {
        val temp = b
        b = a % b
        a = temp
    }

    println("GCD = $a")
}