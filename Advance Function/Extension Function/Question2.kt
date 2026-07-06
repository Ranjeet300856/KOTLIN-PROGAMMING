/*
    Problem Statement:
    Create a Kotlin Extension Function for the Int class named isInRange().
    The function should:
    1. Accept two parameters:
    - minValue
    - maxValue

    2. Check whether the current number lies between minValue and maxValue (inclusive).
    3. Return:
    - true  -> if the number is within the range.
    - false -> otherwise. 
*/

fun Int.isInRange(x: Int, y: Int): Boolean = this in x..y

fun main()
{
    print("Enter Number        : ")
    val number = readln().trim().toIntOrNull()
    print("Enter Minimum Value : ")
    val minValue = readln().trim().toIntOrNull()
    print("Enter Maximum Value : ")
    val maxValue = readln().trim().toIntOrNull()

    if(number == null || minValue == null || maxValue == null)
    {
        println("Invalid Input")
        return
    }

    println(number.isInRange(minValue, maxValue))
}