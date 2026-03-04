import kotlin.math.round
fun main()
{
    //Q9th - round() Demo
    print("Enter a Decimal Number : ")
    var number = readln().trim().toDoubleOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input")
        return
    }

    println("Your Original Number : $number")
    println("After Rounded : ${round(number)}")
}