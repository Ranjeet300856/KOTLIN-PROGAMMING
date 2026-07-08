//Create a Kotlin program to develop a Product Registration System using a Primary Constructor and Multiple Secondary Constructors.
class Product(val productId: Int, val productName: String, var productPrice: Double, var productQuantity: Int)
{
    init {
        if(productPrice < 0) productPrice = 0.0
        if(productQuantity < 0) productQuantity = 1
    }
    constructor(name: String, price: Double) : this(0, name, price, 1) {}
    constructor(name: String) : this(0, name, 0.0, 1) {}

    fun displayProductDetails()
    {
        println("\nProduct Name     : $productName")
        println("Product ID       : $productId")
        println("Product Price    : %.2f".format(productPrice))
        println("Product Quantity : $productQuantity")
    }
}

fun inputProductName(): String
{
    while(true)
    {
        print("Enter Product Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return name
    }
}

fun inputProductID(): Int
{
    while(true)
    {
        print("Enter Product ID : ")
        val id = readln().trim().toIntOrNull()
        if(id == null || id <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return id
    }
}

fun inputProductPrice(): Double
{
    while(true)
    {
        print("Enter Product Price : ")
        val price = readln().trim().toDoubleOrNull()
        if(price == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return price
    }
}

fun inputProductQty(): Int
{
    while(true)
    {
        print("Enter Product Quantity : ")
        val qty = readln().trim().toIntOrNull()
        if(qty == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return qty
    }
}

fun main()
{
    println("1. Press 1 to call primary constructor")
    println("2. Press 2 to call secondary constructor 1")
    println("3. Press 3 to call secondary constructor 2")

    print("\nEnter your choice (1-3) : ")
    val choice = readln().trim().toIntOrNull()
    if(choice == null || choice <= 0 || choice > 3)
    {
        println("Invalid Choice Input!")
        return
    }

    when(choice)
    {
        1 -> {
            val name = inputProductName()
            val id = inputProductID()
            val price = inputProductPrice()
            val quantity = inputProductQty()

            val product = Product(id, name, price, quantity)
            product.displayProductDetails()
        }

        2 -> {
            val name = inputProductName()
            val price = inputProductPrice()
            val product = Product(name, price)
            product.displayProductDetails()
        }

        3 -> {
            val name = inputProductName()
            val product = Product(name)
            product.displayProductDetails()
        }
    }
}