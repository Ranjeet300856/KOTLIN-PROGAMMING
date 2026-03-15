/*
Question 2: Rectangle Area Calculator using Mixed Arguments

This program calculates the area of a rectangle.
The function is called using a combination of positional
and named arguments to demonstrate Kotlin's flexibility.
*/

fun calculateRectangleArea(length: Double, width: Double)
{
    println("Rectangle Area: %.2f".format(length * width))
}
fun main()
{
    print("Enter Length : ")
    val length = readln().trim().toDoubleOrNull()
    print("Enter Width  : ")
    val width = readln().trim().toDoubleOrNull()
    if(length == null || width == null || length <= 0 || width <= 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    calculateRectangleArea(length, width = width)
}