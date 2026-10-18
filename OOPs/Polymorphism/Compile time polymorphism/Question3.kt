//Question 3: Shape Area Calculator
class ShapeCalculator {
    fun calculateArea(side: Int): Int = side * side
    fun calculateArea(length: Int, width: Int): Int = length * width
    fun calculateArea(radius: Double): Double = Math.PI * radius * radius
}

fun main()
{
    val shapeCalculator = ShapeCalculator()
    
    val areaOfSquare = shapeCalculator.calculateArea(5)
    val areaOfRectangle = shapeCalculator.calculateArea(10, 5)
    val areaOfCircle = shapeCalculator.calculateArea(7.0)

    println("Area of Square    : $areaOfSquare")
    println("Area of Rectangle : $areaOfRectangle")
    println("Area of Circle    : %.2f".format(areaOfCircle))
}