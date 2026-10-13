//Question 8: Interface vs Abstract Class
abstract class Shape {
    abstract val name: String
    abstract fun calculateArea(): Double
    fun displayName() {
        println("Shape : $name")
    }
}

interface Drawable {
    fun draw()
    fun displayType() {
        println("This shape is drawable")
    }
}

class Circle(val radius: Double) : Shape(), Drawable {
    override val name = "Circle"
    override fun calculateArea(): Double = 3.14 * radius * radius
    override fun draw() {
        println("Drawing a Circle")
    }
}

class Rectangle(val length: Double, val width: Double) : Shape(), Drawable {
    override val name = "Rectangle"
    override fun calculateArea(): Double = length * width
    override fun draw() {
        println("Drawing a Rectangle")
    }
}

fun printShapeDetails(shape: Shape) {
    println("\nShape : ${shape.name}")
    println("Area  : %.2f".format(shape.calculateArea()))
}

fun main()
{
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    printShapeDetails(circle)
    circle.draw()
    circle.displayType()

    printShapeDetails(rectangle)
    rectangle.draw()
    rectangle.displayType()
}