//Create a Kotlin program to manage product billing information using Single Inheritance.
open class Product(val productName: String, val productId: Int, protected var productPrice: Double)
{
    fun displayProductDetails()
    {
        println("Product Name  : $productName")
        println("Product ID    : $productId")
        println("Product Price : %.2f".format(productPrice))
    }
}

class Billing(
    val quantity: Int,
    val discountPercentage: Double,
    val gstPercentage: Double,
    productName: String,
    productId: Int,
    productPrice: Double
) : Product(productName, productId, productPrice)
{
    fun calculateTotalPrice(): Double = productPrice * quantity
    fun calculateDiscountAmount(): Double = calculateTotalPrice() * discountPercentage / 100
    fun calculateFinalBill(): Double = (calculateTotalPrice() - calculateDiscountAmount()) + ((calculateTotalPrice() - calculateDiscountAmount()) * gstPercentage / 100)
    fun displayBillingDetails()
    {
        println("\nQuantity            : $quantity")
        println("Discount Percentage : %.2f%%".format(discountPercentage))
        println("GST Percentage      : %.2f%%".format(gstPercentage))
        println("Total Price         : %.2f".format(calculateTotalPrice()))
        println("Discount Amount     : %.2f".format(calculateDiscountAmount()))
        println("Final Bill          : %.2f".format(calculateFinalBill()))
    }
}

fun inputProductName(): String
{
    while(true)
    {
        print("Enter Product Name : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun inputPrice(): Double
{
    while(true)
    {
        print("Enter Price : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputIdOrQuantity(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputPercentage(text: String): Double
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
    val productName = inputProductName()
    val productPrice = inputPrice()
    val productId = inputIdOrQuantity("Product ID")
    val quantity = inputIdOrQuantity("Quantity")
    val discountPercentage = inputPercentage("Discount Percentage")
    val gstPercentage = inputPercentage("GST Percentage")

    val product = Billing(quantity, discountPercentage, gstPercentage, productName, productId, productPrice)
    product.displayProductDetails()
    product.displayBillingDetails()
}