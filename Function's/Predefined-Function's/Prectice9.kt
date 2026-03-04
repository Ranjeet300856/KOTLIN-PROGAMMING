import kotlin.math.pow
fun main()
{
    //Q10th - pow() Demo
    print("Enter a Number : ")
    var number = readln().trim().toDoubleOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var cube = number.pow(3.0)
    println("Cube of $number is : $cube")
}