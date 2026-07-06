/*
    Problem Statement:
    Create a Kotlin program to develop a Product Inventory System using
    a Primary Constructor and init Block.

    Requirements:
    1. Create a class named Product.
    2. Use a Primary Constructor to initialize the following properties:
       - Product ID (Int)
       - Product Name (String)
       - Product Price (Double)
       - Product Quantity (Int)

    3. Inside the init Block, validate the following:
       - Product Price must not be negative.
       - Product Quantity must not be negative.
       If any value is negative, display an appropriate message and
       automatically store 0 instead.

    4. Create a member function named displayProductDetails() that displays:
       - Product ID
       - Product Name
       - Product Price
       - Product Quantity

    5. Create at least 4 Product objects:
       Product 1:
       - All valid values.

       Product 2:
       - Negative Price.

       Product 3:
       - Negative Quantity.

       Product 4:
       - Negative Price and Negative Quantity.

    6. Display details of all products.
*/

class Product(val productId: Int, val productName: String, var productPrice: Double, var productQuantity: Int)
{
    init {
        if(productPrice < 0)
        {
            println("Invalid Product Price")
            productPrice = 0.0
        }
        
        if(productQuantity < 0)
        {
            println("Invalid Product Quantity")
            productQuantity = 0
        }
    }

    fun displayProductDetails()
    {
        println("\nProduct ID    : $productId")
        println("Product Name  : $productName")
        println("Product Price : %.2f".format(productPrice))
        println("Quantity      : $productQuantity")
    }
}

fun main()
{
    val product1 = Product(101, "Laptop", 60000.0, 1)
    val product2 = Product(102, "Keyboard", -1000.0, 2)
    val product3 = Product(103, "Mouse", 200.0, -2)
    val product4 = Product(104, "Printer", -10000.0, -1)

    product1.displayProductDetails()
    product2.displayProductDetails()
    product3.displayProductDetails()
    product4.displayProductDetails()
}