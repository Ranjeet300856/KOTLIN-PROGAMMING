/*
    Question 8 — Online Store Price Updater
    Problem Statement
    Create a Kotlin program that manages product prices in an online store using a MutableMap.

    The program should store:
    Key = Product Name (String)
    Value = Price (Double) 
*/

fun main()
{
    val productData = mutableMapOf<String, Double>()

    productData.put("Laptop", 65000.0)
    productData.put("Mobile", 25000.0)
    productData.put("Keyboard", 1200.0)
    productData.put("Mouse", 800.0)

    var expensiveProductName: String? = null
    var expensiveProductPrice: Double? = null

    for(entry in productData.entries)
    {
        val productName = entry.key
        val productPrice = entry.value

        val increasePrice = productPrice + (productPrice * 10) / 100

        productData.replace(productName, increasePrice)
    }

    for(entry in productData.entries)
    {
        val productName = entry.key
        val productPrice = entry.value
        if(expensiveProductName == null || expensiveProductPrice == null || productPrice > expensiveProductPrice)
        {
            expensiveProductName = productName
            expensiveProductPrice = productPrice
        }
    }

    println("Most Expensive Product : $expensiveProductName")
    println("Price                  : %.2f".format(expensiveProductPrice))

    if(productData.containsValue(1320.0)) println("Price Found")
    else println("Price Not Found")

    println("\nFinal Record:")
    for(entry in productData.entries)
    {
        val name = entry.key
        val price = entry.value

        println("Product Name : $name")
        println("Price        : %.2f".format(price))
    }
}