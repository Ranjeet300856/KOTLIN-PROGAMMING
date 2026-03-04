import kotlin.math.min
fun main()
{
    //Q14th - Minimum or Two Integer
    print("Enter 1st Number : ")
    var number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    var number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var minimum = min(number1,number2)
    println("Minimum Number is : $minimum")
}