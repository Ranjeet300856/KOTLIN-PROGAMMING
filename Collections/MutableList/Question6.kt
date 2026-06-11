/*
    Question 6: Product Price Analyzer
    Problem Statement
    Create a Kotlin program that manages product prices using a MutableList<Double>.

    Requirements
    1. Ask the user to enter 5 product prices and store them in a MutableList<Double>.
    Rules:
    Price must be greater than 0.
    Invalid input should be rejected and asked again.

    2. Print all product prices.
    3. Find and print:
    Highest Price
    Lowest Price
    (Do not use maxOrNull() or minOrNull())

    4. Ask the user to enter a price to search.
    Check whether that price exists in the list.
    Print an appropriate message.

    5. Print:
    Total Number of Products
    Average Product Price 
*/

fun main()
{
    val productPrice = mutableListOf<Double>()

    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Product Price ${i + 1} : ")
            val price = readln().trim().toDoubleOrNull()
            if(price == null || price <= 0)
            {
                println("Invalid Input! Try Again")
                continue
            }

            productPrice.add(price)
            break
        }
    }

    print("\nEnter Search Price                : ")
    val searchPrice = readln().trim().toDoubleOrNull()
    if(searchPrice == null || searchPrice <= 0)
    {
        println("Invalid Input")
        return
    }


    println("\nAll Product Prices              : $productPrice")

    var highestPrice: Double? = null
    var lowestPrice: Double? = null
    var found = false
    var sum = 0.0

    for(value in productPrice)
    {
        if(highestPrice == null || value > highestPrice) highestPrice = value
        if(lowestPrice == null || value < lowestPrice) lowestPrice = value

        if(value == searchPrice) found = true

        sum += value
    }
    println("\nHighest Price   : %.2f".format(highestPrice))
    println("Lowest Price    : %.2f".format(lowestPrice))

    if(found) println("\n$searchPrice exists in the list")
    else println("\n$searchPrice not exists in the list")

    println("\nTotal Products : ${productPrice.size}")

    val averagePrice = if(productPrice.size > 0) sum / productPrice.size else 0.0
    println("Average Price  : %.2f".format(averagePrice))
}