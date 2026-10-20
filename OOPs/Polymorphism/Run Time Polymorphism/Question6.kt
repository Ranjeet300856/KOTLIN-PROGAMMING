//Question 6: Shape Area and Perimeter Calculator
abstract class Shape {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double = Math.PI * radius * radius
    override fun calculatePerimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(val length: Double, val width: Double) : Shape() {
    override fun calculateArea(): Double = length * width
    override fun calculatePerimeter(): Double = 2 * (length + width)
}

class Square(val side: Double) : Shape() {
    override fun calculateArea(): Double = side * side
    override fun calculatePerimeter(): Double = 4 * side
}

fun displayShapeDetails(shape: Shape) {
    val area = shape.calculateArea()
    val perimeter = shape.calculatePerimeter()
    println("Area       : %.2f".format(area))
    println("Perimeter  : %.2f\n".format(perimeter))
}

fun main()
{
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)
    val square = Square(4.0)

    val shapes = listOf(circle, rectangle, square)
    for(shape in shapes) {
        displayShapeDetails(shape)
    }
}