//Question 2: Product Price Lookup Using TreeMap
import java.util.TreeMap

fun inputProductName(): String
{
    while(true)
    {
        print("Enter Product Name : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputProductPrice(): Double
{
    while(true)
    {
        print("Enter Product Price : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun addProduct(products: TreeMap<String, Double>)
{
    while(true)
    {
        val productName = inputProductName()
        if(products.containsKey(productName))
        {
            println("Product already exists.")
            continue
        }

        val productPrice = inputProductPrice()
        products[productName] = productPrice
        println("Produt Added Successfully")
        break
    }
}

fun searchProduct(products: TreeMap<String, Double>)
{
    val productName = inputProductName()
    if(products.containsKey(productName))
    {
        println("Product Found")
        println("Product Name  : $productName")
        println("Product Price : %.2f".format(products[productName]))
    }
    else println("Product not found.")
}

fun displayFirstProduct(products: TreeMap<String, Double>)
{
    if(products.isEmpty())
    {
        println("No products available")
        return
    }

    val firstProduct = products.firstEntry()
    println("First Product:")
    println("Product Name : ${firstProduct.key}")
    println("Price        : %.2f".format(firstProduct.value))
}

fun displayAllProducts(products: TreeMap<String, Double>)
{
    if(products.isEmpty())
    {
        println("No products available")
        return
    }

    println("Product Name\t\tPrice")
    for((key, value) in products.entries)
    println("$key\t\t%.2f".format(value))
}

fun main()
{
    val products = TreeMap<String, Double>()
    println("\n===== Product Price Lookup =====\n")
    while(true)
    {
        println("\n1. Add Product")
        println("2. Search Product")
        println("3. Display First Product")
        println("4. Display All Products")
        println("5. Exit")

        print("\nEnter your choice : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addProduct(products)
            2 -> searchProduct(products)
            3 -> displayFirstProduct(products)
            4 -> displayAllProducts(products)
            5 -> {
                println("Program Exited")
                break
            }

            else -> println("Invalid Choice! Please Enter 1..5")
        }
    }
}