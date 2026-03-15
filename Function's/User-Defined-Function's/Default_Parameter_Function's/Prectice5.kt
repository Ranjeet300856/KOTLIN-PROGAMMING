/*
Question 5: Product Information Display with Default Parameters

Write a Kotlin function displayProduct(productName: String,
price: Double = 100.0, quantity: Int = 1) that prints product
details and calculates the total cost.

Demonstrate function calls using:
1. Default parameters
2. Passing some arguments
3. Named arguments to skip a middle parameter
4. Passing all arguments
*/

fun displayProduct(productName: String, price: Double = 100.0, quantity: Int = 1)
{
    if(price < 0 || quantity <= 0)
    {
       println("Invalid product data")
       return
    }
    val totalCost = price * quantity
    println("Product    = $productName")
    println("Price      = $price")
    println("Quantity   = $quantity")
    println("Total Cost = $totalCost")
    println()
}
fun main()
{
    displayProduct("Laptop")
    displayProduct("Mouse", 500.0)
    displayProduct("Keyboard", quantity = 3)
    displayProduct("Monitor", 15000.0, 2)
}