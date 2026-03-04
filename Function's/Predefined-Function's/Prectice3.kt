import kotlin.math.max
import kotlin.math.min
fun main()
{
    //Q4th - Maximum and Minimum Between Two Numbers
    print("Enter 1st Number : ")
    var number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    var number2 = readln().trim().toIntOrNull()

    if(number1 == null || number2 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }
    println("${max(number1, number2)} is Maximum")
    println("${min(number1, number2)} is Minimum")
}