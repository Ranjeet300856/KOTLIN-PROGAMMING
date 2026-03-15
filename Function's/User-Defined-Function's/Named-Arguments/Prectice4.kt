/*
Question 4: Product Discount Calculator using Default and Named Arguments

This program calculates the final price of a product after applying
a discount. The function uses a default discount parameter and is
called multiple times using named arguments.
*/

fun calculateFinalPrice(productName: String, productPrice: Double, discount: Double = 0.0)
{
    println("Product Name: $productName")
    println("Original Price: %.2f".format(productPrice))
    println("Discount: $discount%")
    println ("Final Price: %.2f".format(productPrice - (productPrice * discount) / 100))
    println()
}
fun main()
{
    print("Enter Product Name  : ")
    val productName = readln().trim()
    print("Enter Product Price : ")
    val productPrice = readln().trim().toDoubleOrNull()
    if(productName.isBlank() || !productName.all { it.isLetterOrDigit() || it.isWhitespace() } ||productPrice == null || productPrice <= 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    println()
    calculateFinalPrice(productName = productName, productPrice = productPrice)
    calculateFinalPrice(productName = productName, productPrice = productPrice, discount = 10.0)
}