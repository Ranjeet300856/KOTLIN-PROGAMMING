/*
    Question 2 — Product Inventory Management System (Basic → Intermediate Level)
    Problem Statement
    Create a Kotlin program that works as a Product Inventory Management System using a MutableMap.

    The program should store product records where:
    Key = Product Name (String)
    Value = Product Quantity (Int) 
*/

fun manageInventory(productData: MutableMap<String, Int>, displayData: (MutableMap<String, Int>) -> Unit) = displayData(productData)

fun main()
{
    val productData = mutableMapOf<String, Int>()
    manageInventory(productData) {
        products: MutableMap<String, Int> ->

        products.put("Laptop", 15)
        products.put("Mobile", 30)
        products.put("Keyboard", 20)
        products.put("Mouse", 25)

        println("All Products:")
        for((key, value) in products)
        {
            println("Product Name : $key")
            println("Quantity     : $value")
        }

        products["Mobile"] = 50

        if(products.containsKey("Keyboard")) println("\nProduct Available")
        else println("Product Not Available")

        val removeProduct = products.remove("Mouse")
        if(removeProduct != null) println("Product Removed Successfully")
        else println("Product Not Found")

        println("\nTotal Products : ${products.size}")

        println("\nOnly Products Name:")
        for(value in products.keys) println("$value")

        println("\nOnly Quantities")
        for(quantitie in products.values) println("$quantitie")

        println("\nAll Records: ")
        for((key, value) in products)
        {
            println("Product Name : $key")
            println("Quantity     : $value")
        }
    }
}