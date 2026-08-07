//Create a Kotlin program to manage and search product names using Collection Higher-Order Functions.
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

fun main()
{
    val totalProducts = inputInteger("The Total Number of Products")
    val products = mutableListOf<String>()
    for(i in 1..totalProducts)
    {
        val productName = inputString("Product $i Name")
        products.add(productName)
    }

    val searchProduct = inputString("Product Name to Search")
    val findResult = products.find { it.lowercase() == searchProduct.lowercase() }

    val anyResult = products.any { it.length >= 5 }
    val allResult = products.all { it[0].isLetter() }

    println("\n----- All Products -----")
    products.forEach { println(it) }

    println("\n----- Search Result -----")
    if(findResult != null) println("Product Found : $findResult")
    else println("Product Not Found")

    println("\n----- Product Checks -----")
    println("At least one product has 5 or more characters : ${if(anyResult) "YES" else "NO"}")
    println("All product names start with a letter         : ${if(allResult) "YES" else "NO"}")
}