import kotlin.math.abs
fun sumOfDigits(n: Int): Int = abs(n).toString().sumOf { it - '0' }
fun main()
{
    //Q9th
    /*
    Write a Kotlin program that defines a Single Expression Function named sumOfDigits.
    The function should:
    Take one integer parameter n
    Return the sum of all digits of the number
    Examples:
    123  → 1 + 2 + 3 = 6    
    405  → 4 + 0 + 5 = 9
    */

    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number! Please Enter a Valid Integer!")
        return
    }

    println("Sum of Digits = ${sumOfDigits(number)}")
}