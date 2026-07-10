//Create a Kotlin program to manage product prices using LinkedHashMap.

fun inputProductName(products: LinkedHashMap<String, Double>, x: Int): String
{
    while(true)
    {
        print("Enter product $x name : ")
        val name = readln().trim().lowercase()
        if(name.isBlank() || name.length < 3)
        {
            println("Invalid Input! Try Again")
            continue
        }

        if(products.containsKey(name))
        {
            println("Duplicate product not allowed! try again")
            continue
        }

        return name
    }
}

fun inputProductPrice(): Double
{
    while(true)
    {
        print("Enter product price : ")
        val price = readln().trim().toDoubleOrNull()
        if(price == null || price <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return price
    }
}

fun display(products: LinkedHashMap<String, Double>)
{
    println("Product Records:")
    for((key, value) in products.entries)
    println("$key  ->  %.2f".format(value))
}

fun calculation(products: LinkedHashMap<String, Double>)
{
    var expensiveProduct = products.keys.first()
    var expensiveProductPrice = products.values.first()
    var cheapestProduct = products.keys.first()
    var cheapestProductPrice = products.values.first()
    var sum = 0.0
    for((key, value) in products.entries)
    {
        sum += value
        if(value > expensiveProductPrice)
        {
            expensiveProduct = key
            expensiveProductPrice = value
        }
        
        if(value < cheapestProductPrice)
        {
            cheapestProduct = key
            cheapestProductPrice = value
        }
    }

    val average = if(products.isNotEmpty()) sum / products.size else 0.0

    println("\nTotal Products      : ${products.size}")
    println("Most Expensive      : $expensiveProduct -> %.2f".format(expensiveProductPrice))
    println("Cheapest Product    : $cheapestProduct  -> %.2f".format(cheapestProductPrice))
    println("Average Price       : %.2f".format(average))
}

fun main()
{
    val products = LinkedHashMap<String, Double>()
    print("Enter total number of products : ")
    val totalProducts = readln().trim().toIntOrNull()
    if(totalProducts == null || totalProducts <= 0)
    {
        println("Invalid Input!")
        return
    }

    for(i in 1..totalProducts)
    {
        val productName = inputProductName(products, i)
        val productPrice = inputProductPrice()
        products[productName] = productPrice
    }

    display(products)
    calculation(products)

    while(true)
    {
        print("Enter product name to search : ")
        val searchProduct = readln().trim().lowercase()
        if(searchProduct.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        if(products.containsKey(searchProduct))
        {
            println("Product Found")
            println("Name  : $searchProduct")
            println("Price : %.2f".format(products[searchProduct]))
        }
        else println("Product not found.")

        break
    }
}