/*
    Question 2: Product Price Management System Using HashMap
    Problem Statement:
    Create a Kotlin program to develop a Product Price Management System using HashMap Collection.

    The program should allow users to manage product prices through a Menu Driven Program.
    Features:
    1. Add a new product.
       - Product name must be unique.
       - Product name should not be blank.
       - Product price must be greater than 0.
       - If the product already exists, display an appropriate message.

    2. Display all products with their prices.
    3. Search a product by product name.
    4. Update product price.
       - Update only if the product exists.
       - New price must be greater than 0.

    5. Remove a product.
    6. Check whether a specific price exists.
       (Use containsValue())

    7. Display total number of products.
    8. Remove all products from the HashMap.
       (Use clear())

    9. Exit.
*/

fun inputName(): String
{
    while(true)
    {
        print("Enter Product Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return name
    }
}

fun inputPrice(): Double
{
    while(true)
    {
        print("Enter Product Price : ")
        val price = readln().trim().toDoubleOrNull()
        if(price == null || price <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return price
    }
}

fun checkEmpty(products: HashMap<String, Double>): Boolean
{
    if(products.isEmpty())
    {
        println("No data avaiable (Product map is empty)")
        return true
    }
    else return false
}

fun addNewProduct(products: HashMap<String, Double>)
{
    val productName = inputName()
    if(products.containsKey(productName))
    {
        println("$productName already available in stock")
        return
    }

    val productPrice = inputPrice()
    products.put(productName, productPrice)
    println("Product added successfully")
}

fun displayProducts(products: HashMap<String, Double>)
{
    if(checkEmpty(products)) return
    println("All Products:")
    for((key, value) in products.entries)
    println("$key  :  %.2f".format(value))
    println()
}

fun searchProduct(products: HashMap<String, Double>)
{
    if(checkEmpty(products)) return
    val productName = inputName()
    if(products.containsKey(productName)) println("Product Found")
    else println("Product Not Found")
}

fun updateProduct(products: HashMap<String, Double>)
{
    if(checkEmpty(products)) return
    val productName = inputName()
    if(products.containsKey(productName))
    {
        val newPrice = inputPrice()
        products.replace(productName, newPrice)
        println("Product updated successfully")
    }
    else println("Product not available")
}

fun removeProduct(products: HashMap<String, Double>)
{
    if(checkEmpty(products)) return
    val productName = inputName()
    if(products.containsKey(productName))
    {
        products.remove(productName)
        println("Product removed successfully")
    }
    else println("Product not found")
}

fun checkProduct(products: HashMap<String, Double>)
{
    if(checkEmpty(products)) return
    val productPrice = inputPrice()
    if(products.containsValue(productPrice)) println("$productPrice Found")
    else println("$productPrice not found")
}
fun displaySize(products: HashMap<String, Double>) = println("Total Products : ${products.size}")
fun removeAllProducts(products: HashMap<String, Double>)
{
    if(checkEmpty(products)) return
    products.clear()
    if(products.isEmpty())println("All product cleared (Product map is empty)")
}

fun main()
{
    println("\n===== Product Price Management System =====\n")
    val products = HashMap<String, Double>()
    while(true)
    {
        println("\n1. Add a new product.")
        println("2. Display all products.")
        println("3. Search a product by product name.")
        println("4. Update product price.")
        println("5. Remove a product.")
        println("6. Check whether a specific price exists.")
        println("7. Display total number of products.")
        println("8. Remove all products from the HashMap.")
        println("9. Exit the program.")

        print("\nEnter your choice (1..9) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null || choice <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewProduct(products)
            2 -> displayProducts(products)
            3 -> searchProduct(products)
            4 -> updateProduct(products)
            5 -> removeProduct(products)
            6 -> checkProduct(products)
            7 -> displaySize(products)
            8 -> removeAllProducts(products)
            9 -> {
                println("Program Exited Successfully")
                break
            }

            else -> println("Invalid Choice! Please Enter 1-9")
        }
    }
}