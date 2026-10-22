//Create a Kotlin program using Abstraction to calculate the area of different shapes.
abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        if(radius <= 0) {
            return -1.0
        } else {
            return Math.PI * radius * radius
        }
    }
}

class Rectangle(val length: Double, val width: Double) : Shape() {
    override fun calculateArea(): Double {
        return if(length <= 0 || width <= 0) -1.0 else length * width
    }
}

fun main()
{
    val circle = Circle(8.5)
    val rectangle = Rectangle(6.0, 4.2)

    val areaOfCircle = circle.calculateArea()
    val areaOfRectangle = rectangle.calculateArea()

    if(areaOfRectangle == -1.0) println("Invalid Length or Width")
    else println("Area of Rectangle : %.2f".format(areaOfRectangle))

    if(areaOfCircle == -1.0) println("Invalid Radius")
    else println("Area of Circle    : %.2f".format(areaOfCircle))
}