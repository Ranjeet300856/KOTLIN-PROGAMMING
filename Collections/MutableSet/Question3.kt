/*
    Question 3 — Unique Product Price Analyzer

    Problem Statement:
    Create a Kotlin program for an e-commerce company using
    MutableSet<Double>. The program should manage unique product prices,
    perform add/remove operations, verify price availability,
    and analyze the collection before and after clearing it.
*/

fun main()
{
    val productPrices = mutableSetOf(499.99, 799.50, 1299.00, 499.99, 999.99)

    print("All Product Prices : ")
    for(price in productPrices) print("%.2f ".format(price))

    println("\nTotal product prices : ${productPrices.size}")

    if(799.50 in productPrices) println("Product price 799.50 is exists in list")
    else println("Product price 799.50 is not exists in list")

    val productPrices2 = mutableSetOf(1499.99, 1999.99, 999.99)
    productPrices.addAll(productPrices2)
    print("\nUpdated Price List : ")
    for(price in productPrices) print("%.2f ".format(price))

    println("\nTotal product prices after updated : ${productPrices.size}")

    if(productPrices.remove(1299.00)) println("\n1299.00 price removed successfully")
    else println("\n1299.00 price dose not exitsts")

    if(productPrices.isNotEmpty()) println("\nProduct price list is not empty")
    else println("\nProduct price list is empty")

    productPrices.clear()
    if(productPrices.isEmpty()) println("Product price list is empty after clear()")
    else println("\nProduct price list is not empty")
}