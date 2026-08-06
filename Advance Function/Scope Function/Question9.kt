//Create a Kotlin program to register and log a new product using the `also` scope function.
class Product(var productName: String, var productPrice: Double, var stock: Int)
{
    fun display()
    {
        println("\nProduct Name : $productName")
        println("Product Price  : %.2f".format(productPrice))
        println("Stock          : $stock")
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
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
    val productName = inputString("Product Name")
    val productPrice = inputDouble("Product Price")
    val stock = inputInteger("Product Stocks")

    val product = Product(productName, productPrice, stock)
    val alsoProduct = product.also {
        println("Product registered successfully.")
        println("Product Name   : ${it.productName}")
        println("Product Stocks : ${it.stock}")
    }

    alsoProduct.display()
    if(product === alsoProduct) println("Both References Are Same")
    else println("Both References Are Not Same")
}