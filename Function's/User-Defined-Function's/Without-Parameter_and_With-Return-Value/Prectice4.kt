fun getCircleArea(): Double
{
    val radius = 7
    val PI = 3.14
    val area = PI * radius * radius
    return area
}
fun main()
{
    //Q4th
    /*
    Write a Kotlin program that defines a function getCircleArea() which takes no parameters but returns the area of a circle.
    Inside the function:
    Set radius = 7
    */

    val areaOfCircle = getCircleArea()
    println("Area of Circle = $areaOfCircle")
}