//Question 4 — Abstract Class with Abstract Property
abstract class Shape {
    abstract val name: String
    fun displayName() {
        println("Shape Name : $name")
    }

    abstract fun calculateArea()
}

class Circle(val radius: Double) : Shape() {
    override val name = "Circle"
    override fun calculateArea() {
        val area = 3.14 * radius * radius
        println("Area of Circle : %.2f".format(area))
    }
}

class Rectangle(val length: Double, val width: Double) : Shape() {
    override val name = "Rectangle"
    override fun calculateArea() {
        val area = length * width
        println("Area of Rectangle : %.2f".format(area))
    }
}

fun main()
{
    val circle = Circle(5.8)
    val rectangle = Rectangle(20.22,10.18)

    circle.displayName()
    circle.calculateArea()

    println()
    rectangle.displayName()
    rectangle.calculateArea()
}