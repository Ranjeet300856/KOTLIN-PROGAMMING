import kotlin.math.abs
fun main()
{
    //Q5th - Absolute Value
    print("Enter Number : ")
    var number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }
    
    println("Absolute Value is : ${abs(number)}")
}