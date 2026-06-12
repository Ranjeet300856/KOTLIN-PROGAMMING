/*
    Question 8 — Product Price Lookup System
    Problem Statement
    Create a Kotlin program that works as a Product Price Lookup System using an Immutable Map. 
*/

fun displayProductData(productPrices: Map<String, Int>, productCode: String)
{
    if(productPrices.containsKey(productCode))
    {
        println("Product Code : $productCode")
        println("Price        : ${productPrices[productCode]}")

        val price = productPrices[productCode]
 
        if(price >= 30000) println("Category     : Premium Product\n")
        else if(price >= 1000) println("Category     : Standard Product\n")
        else println("Category     : Budget Product\n")
    }
    else 
    {
        println("Product Code : $productCode")
        println("Product Not Found\n")
    }
}

fun main()
{
    val productPrices = mapOf(
        "P101" to 45000,
        "P102" to 25000,
        "P103" to 1500,
        "P104" to 800,
        "P105" to 120
    )

    val productCode = "P103"
    displayProductData(productPrices, productCode)

    val code1 = "P101"
    displayProductData(productPrices, code1)

    val code2 = "P105"
    displayProductData(productPrices, code2)

    val code3 = "P999"
    displayProductData(productPrices, code3)
}