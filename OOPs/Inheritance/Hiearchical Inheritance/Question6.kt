//Create a Kotlin program to demonstrate Hierarchical Inheritance for an e-commerce product management system.
open class Product(val productId: Int, val productName: String, val price: Double)
{
    fun displayProductInfo()
    {
        println("Product ID     : $productId")
        println("Product Name   : $productName")
        println("Product Price  : %.2f".format(price))
    }
}

class Electronic(
    val warrantyYears: Int,
    val hasBluetooth: Boolean,
    productId: Int,
    productName: String,
    price: Double
) : Product(productId, productName, price)
{
    fun displayElectronicProduct()
    {
        println("\nElectronic Product:")
        displayProductInfo()
        println("Warranty Years : $warrantyYears")
        println("Has Bluetooth  : ${if(hasBluetooth) "YES" else "NO"}")
    }
}

class Clothing(
    val size: String,
    val isAvailable: Boolean,
    productId: Int,
    productName: String,
    price: Double
) : Product(productId, productName, price)
{
    fun displayClothInfo()
    {
        println("\nCloths Info:")
        displayProductInfo()
        println("Cloth Size     : $size")
        println("IsAvailable    : ${if(isAvailable) "YES" else "NO"}")
    }
}

class Grocery(
    val weightInKg: Double,
    val expiryDays: Int,
    productId: Int,
    productName: String,
    price: Double
) : Product(productId, productName, price)
{
    fun displayGroceryInfo()
    {
        println("\nGrocery Info:")
        displayProductInfo()
        println("Weight KG      : %.2f".format(weightInKg))
        println("Expiry Days    : $expiryDays")
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

fun inputInteger(text: String): Int
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

fun inputLong(text: String): Long
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toLongOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputBoolean(text: String): Boolean
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
        
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else println("Invalid Input! Try Again")
    }
}

fun main()
{
    //Electronic
    val warrantyYears = inputInteger("Warranty Years")
    val hasBluetooth = inputBoolean("Yes or No for has Bluetooth")
    val electronicProductId = inputInteger("Product ID")
    val electronicproductName = inputString("Product Name")
    val electronicPrice = inputDouble("Product Price")
    val electronic = Electronic(warrantyYears, hasBluetooth, electronicProductId, electronicproductName, electronicPrice)

    //Cloths
    println()
    val size = inputString("Cloth Size")
    val isAvailable = inputBoolean("Yes or No for is Available")
    val clothId = inputInteger("Product ID")
    val clothName = inputString("Product Name")
    val clothPrice = inputDouble("Product Price")
    val cloth = Clothing(size, isAvailable, clothId, clothName, clothPrice)

    //Grocery
    println()
    val weightInKg = inputDouble("Product Weight")
    val expiryDays = inputInteger("Expriry Days")
    val groceryProductId = inputInteger("Product ID")
    val groceryProductName = inputString("Product Name")
    val groceryPrice = inputDouble("Product Price")
    val grocery = Grocery(weightInKg, expiryDays, groceryProductId, groceryProductName, groceryPrice)

    //Output
    electronic.displayElectronicProduct()
    cloth.displayClothInfo()
    grocery.displayGroceryInfo()
}