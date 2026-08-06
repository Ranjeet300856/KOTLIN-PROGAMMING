//Create a Kotlin program to validate and log an optional customer order using the `also` scope function.
class Order(val orderId: Int, val productName: String, val quantity: Int)
{
    fun display()
    {
        println("\nOrder ID     : $orderId")
        println("Product Name : $productName")
        println("Quantity     : $quantity")
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

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun main()
{
    var orderId = 0
    while(true)
    {
        val input = inputInteger("Order ID")
        if(input == 0) println("Invalid Order ID! Try Again")
        else {
            orderId = input
            break
        }
    }
    val productName = inputString("Product Name")
    var quantity = inputInteger("Quantity")

    val order: Order? = if(quantity > 0) Order(orderId, productName, quantity) else null
    val alsoResult: Order? = order?.also {
        println("Order accepted successfully.")
        println("Order ID     : ${it.orderId}")
        println("Product Name : ${it.productName}")
    }

    if(alsoResult == null) println("Order was not created because quantity is zero.")
    else alsoResult.display()
}