import kotlin.math.pow
fun main()
{
    //Q13th
    print("Enter Number : ")
    var number = readln().trim().toDoubleOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var square = number.pow(2)
    println("Square of $number is : $square")
}