/*
Question 8: Rectangle Area Calculator using Default Parameters

Write a Kotlin function calculateRectangleArea(length: Double, width: Double = 1.0)
that calculates and returns the area of a rectangle.

Demonstrate function calls using default parameters and named arguments.
*/

fun calculateRectangleArea(length: Double, width: Double = 1.0): Double = length * width

fun main()
{
    println("Area : ${calculateRectangleArea(10.0)}")
    println("Area : ${calculateRectangleArea(10.0, 5.0)}")
    println("Area : ${calculateRectangleArea(length = 8.0, width = 4.0)}")
}