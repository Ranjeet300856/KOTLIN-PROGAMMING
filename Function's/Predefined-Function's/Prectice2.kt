import kotlin.math.sqrt
fun main()
{
    //Q3rd - Squre Root of Number
    print("Enter a Number : ")
    var number = readln().trim().toDoubleOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }
    if(number < 0)
    {
        println("Square root of negative number is not allowed!")
        return
    }

    println("Square Root of $number is : ${sqrt(number)}")
}