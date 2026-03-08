fun calculateRectangleArea(length: Double, width: Double): Double
{
    val area = length * width
    return area
}
fun main()
{
    //Q3rd
    /*
    Write a Kotlin program that defines a function calculateRectangleArea(length: Double, width: Double) 
    which takes two parameters and returns the area of a rectangle.
    The program should call this function from main() and print the returned result.
    */

    print("Enter Length of Rectangle : ")
    val length = readln().trim().toDoubleOrNull()
    print("Enter Width of Rectangle  : ")
    val width = readln().trim().toDoubleOrNull()
    if(length == null || width == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    if(length <= 0 || width <= 0)
    {
        println("Length and Width must be positive!")
        return
    }
    val area = calculateRectangleArea(length, width)
    println("Area of Rectangle = %.2f".format(area))
}