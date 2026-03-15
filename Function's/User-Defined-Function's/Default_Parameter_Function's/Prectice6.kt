/*
Question 6: Discount Calculator using Default Parameter

Write a Kotlin function calculateFinalPrice(price: Double,
discountPercent: Double = 10.0) that calculates and returns
the final price after applying a discount.

The function should return the value instead of printing it.
Demonstrate calling the function using default and named arguments.
*/

fun calculateFinalPrice(price: Double, discountPercent: Double = 10.0): Double = price - (price * discountPercent) / 100
fun main()
{
    println("Final Price : ${calculateFinalPrice(1000.0)}")
    println("Final Price : ${calculateFinalPrice(2000.0, 20.0)}")
    println("Final Price : ${calculateFinalPrice(price = 1500.0, discountPercent = 15.0)}")
}