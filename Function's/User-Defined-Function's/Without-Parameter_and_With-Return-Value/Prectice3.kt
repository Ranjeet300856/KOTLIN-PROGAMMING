fun getRectangleArea(): Int
{
    val length = 10
    val width = 5
    val area = length * width
    return area
}
fun main()
{
    //Q3rd
    /*
    Write a Kotlin program that defines a function getRectangleArea() which takes no parameters but returns the area of a rectangle.
    Inside the function:
    Set length = 10
    Set width = 5
    The function should calculate the area of the rectangle and return the result.
    The program should call this function from main() and print the returned value.
    */

    val areaOfRectangle = getRectangleArea()
    println("Area of Rectangle = $areaOfRectangle")
}