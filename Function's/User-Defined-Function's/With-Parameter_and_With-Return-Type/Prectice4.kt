import kotlin.math.PI
fun calculateCircleArea(radius: Double): Double
{
    return PI * radius * radius
}
fun main()
{
    //4th
    /*
    Write a Kotlin program that defines a function calculateCircleArea(radius: Double)
    which takes one parameter and returns the area of a circle.
    */

    print("Enter Radius : ")
    val radius = readln().trim().toDoubleOrNull()
    if(radius == null || radius < 0)
    {
        print("Input is Empty or Invalid Input!")
        return
    }

    val area = calculateCircleArea(radius)
    println("Area of Circle = %.2f".format(area))
}