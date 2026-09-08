/*
    Question 5 — Order Management System

    Create the following Kotlin data classes:
    1. Product
       - id: Int
       - name: String
       - price: Double

    2. Order
       - orderId: Int
       - customerName: String
       - product: Product
       - quantity: Int

    Create at least two different Product objects.
    Create an Order object using one of the Product objects.

    Your program should:
    1. Print the complete Order information.
    2. Create a new Order using copy() with a different quantity.
    3. Create another new Order using copy() where the Product's price
       is also changed.
    4. Print the original Order and both modified Orders.
    5. Verify that modifying the copied Order does not change the
       original Order's quantity.
    6. Verify that the original Product's price remains unchanged
       when creating an updated Product.
    7. Demonstrate that two Product objects containing exactly the
       same data are considered equal.
*/

data class Product(
    val id: Int,
    val name: String,
    var price: Double
)

data class Order(
    val orderId: Int,
    val customerName: String,
    val product: Product,
    var quantity: Int
)

fun inputInt(text: String): Int
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

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    //Product 1
    val product1Id = inputInt("Product 1 ID")
    val product1Name = inputString("Product 1 Name")
    val product1Price = inputDouble("Product 1 Price")
    val product1 = Product(product1Id, product1Name, product1Price)

    //Product
    println()
    val product2Id = inputInt("Product 2 ID")
    val product2Name = inputString("Product 2 Name")
    val product2Price = inputDouble("Product 2 Price")
    val product2 = Product(product2Id, product2Name, product2Price)

    //Order
    println()
    val orderId = inputInt("Order ID")
    val customerName = inputString("Order Name")
    val quantity = inputInt("Quantity")
    val order1 = Order(orderId, customerName, product1, quantity)

    println("\nOrder Information     : $order1")
    println("Product 1 Information : $product1")
    println("Product 2 Information : $product2")
    
    val newQty = inputInt("Quantity for new order")
    val order2 = order1.copy(quantity = newQty)

    val newPrice = inputDouble("Price for new order")
    val updatedProduct = order1.product.copy(price = newPrice)
    val order3 = order1.copy(
        product = updatedProduct
    )

    println("\nOriginal Order : $order1")
    println("Second Order     : $order2")
    println("Third Order      : $order3")

    println()
    println("Original Order Quantity : ${order1.quantity}")
    println("Copied Order Quantity   : ${order2.quantity}")
    println("Original Product Price : ${order1.product.price}")
    println("Updated Product Price  : ${order3.product.price}")

    val product3 = product1.copy()
    println("Are Product 1 and Product 3 equal? ${product1 == product3}")
}