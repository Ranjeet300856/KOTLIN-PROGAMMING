/*
    Question 9 — Product Inventory Analyzer Using Arrays and Predefined Packages

    Problem Statement
    Write a Kotlin program that analyzes a small product inventory using Arrays and Kotlin predefined packages.

    Your program should:
    Take details of 5 products from the user:
    Product Name
    Product Price
    Product Quantity

    Store:
    Product Names in a String Array
    Prices in a Double Array
    Quantities in an Int Array

    Display:
    All Product Details
    Total Inventory Value
    Most Expensive Product
    Cheapest Product
    Average Product Price

    Search:
    Ask the user for a product name
    Display whether the product exists or not

    Display:
    Product names in Uppercase
    Product names in Lowercase
    Print a professional inventory analysis report. 
*/

//-------------------- Input Function --------------------//
fun inputValues(products: Array<String>, prices: DoubleArray, quantities: IntArray)
{
    for(index in products.indices)      //Note - Loop ranged based on products length because all three arrays of length is same.
    {
        println("Enter Product ${index + 1} Data: ")
        while(true)
        {
            print("Enter Product Name     : ")
            val productName = readln().trim()
            
            print("Enter Product Price    : ")
            val productPrice = readln().trim().toDoubleOrNull()

            print("Enter Product Quantity : ")
            val quantity = readln().trim().toIntOrNull()

            if(productName.isBlank() || productPrice == null || productPrice <= 0 || quantity == null || quantity < 0)
            {
                println("Invalid Input! Try Again")
                continue
            }

            products[index] = productName
            prices[index] = productPrice
            quantities[index] = quantity
            break
        }

        println()
    }
}

//-------------------- Display Function --------------------//
fun displayProductData(products: Array<String>, prices: DoubleArray, quantities: IntArray)
{
    //Variable Declaration
    var inventoryValue = 0.0
    var totalPrice = 0.0
    var expensiveProduct = products[0]
    var cheapestProduct = products[0]
    var highestPrice: Double? = null
    var lowestPrice: Double? = null

    println("\n-------- Product Inventory Report --------\n")

    println("\nProduct Details:")
    for(index in products.indices)
    {
        //Values
        val productName = products[index]
        val productPrice = prices[index]
        val quantity = quantities[index]

        println("$productName -> Price: ${"%.2f".format(productPrice)} | Quantity: $quantity")

        //Calculations
        inventoryValue += productPrice * quantity
        totalPrice += productPrice

        if(highestPrice == null || highestPrice < productPrice)
        {
            highestPrice = prices[index]
            expensiveProduct = products[index]
        }
        if(lowestPrice == null || lowestPrice > productPrice)
        {
            lowestPrice = prices[index]
            cheapestProduct = products[index]
        }
    }
    println()
    val averagePrice = totalPrice / products.size

    println("Total Inventory Value : %.2f".format(inventoryValue))
    println("Most Expensive Product: $expensiveProduct")
    println("Cheapest Product      : $cheapestProduct")
    println("Average Product Price : %.2f".format(averagePrice))
    println()

    //Product Name in Uppercase
    println("Uppercase Product Names:")
    for(productName in products) println(productName.uppercase())
    println()

    //Product Name in Lowercase
    println("Lowercase Product Names:")
    for(productName in products) println(productName.lowercase())
    println()
}

//-------------------- Search Function --------------------//
fun searchProduct(products: Array<String>)
{
    print("Enter Search Product : ")
    val productName = readln().trim()
    if(productName.isBlank())
    {
        println("Invalid Input")
        return
    }

    var found = false
    for(value in products)
    {
        if(value.lowercase() == productName.lowercase())
        {
            println("Product Found")
            found = true
            break
        }
    }

    if(!found) println("Product Not Found")
}

//-------------------- Main Function --------------------//
fun main()
{
    //Array Creations
    val products = Array(5) { "" }
    val prices = DoubleArray(5)
    val quantities = IntArray(5)

    //Input Values
    inputValues(products, prices, quantities)

    //Display Data
    displayProductData(products, prices, quantities)

    //Search Product
    searchProduct(products)
}