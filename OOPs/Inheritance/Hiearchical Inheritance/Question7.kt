//Create a Kotlin program to demonstrate Hierarchical Inheritance for calculating the area of different shapes.
open class Shape(val shapeName: String)
{
    fun displayShapeName()
    {
        println("\nShape Name        : $shapeName")
    }
}

class Circle(val radius: Double, shapeName: String) : Shape(shapeName)
{
    fun calculateCircleArea()
    {
        val pi = 3.14
        val area = pi * radius * radius
        displayShapeName()
        println("Area of Circle    : %.2f".format(area))
    }
}

class Rectangle(val length: Double, val width: Double, shapeName: String) : Shape(shapeName)
{
    fun calculateRectangleArea()
    {
        val area = length * width
        displayShapeName()
        println("Area of Rectangle : %.2f".format(area))
    }
}

class Triangle(val base: Double, val height: Double, shapeName: String) : Shape(shapeName)
{
    fun calculateTriangleArea()
    {
        val area = 0.5 * base * height
        displayShapeName()
        println("Area of Triangle   : %.2f".format(area))
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun main()
{
    //Circle
    val circleRadius = inputDouble("Circle Radius")
    val circle = Circle(circleRadius, "Circle")

    //Rectangle
    val length = inputDouble("Rectangle Length")
    val width = inputDouble("Rectangle Width")
    val rectangle = Rectangle(length, width, "Rectangle")

    //Triangle
    val base = inputDouble("Triangle Base")
    val height = inputDouble("Triangle Height")
    val Triangle = Triangle(base, height, "Triangle")

    //Output
    circle.calculateCircleArea()
    rectangle.calculateRectangleArea()
    Triangle.calculateTriangleArea()
}