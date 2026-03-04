import kotlin.math.round
fun main()
{
    //Q15th
    print("Enter a Number : ")
    var number = readln().trim().toDoubleOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var roundedNum = round(number).toString()
    if(roundedNum.contains('5')) println("Rounded value contains '5'.")
    else println("Rounded value does not contain '5'.")
}