//Create a Kotlin program to manage the discount percentage of products using a Companion Object.
class Product(val productName: String, private var originalPrice: Double)
{
    companion object
    {
        private var discountPercentage = 10.0
        fun updateDiscount(newDiscount: Double)
        {
            if(newDiscount < 0 || newDiscount > 100)
            {
                println("Invalid Discount Percentage!")
                return
            }

            discountPercentage = newDiscount
        }
        fun displayDiscount() = println("Current Discount Percentage : %.2f%%".format(discountPercentage))
    }

    fun displayProductDetails()
    {
        println("\nProduct Name   : $productName")
        println("Original Price : %.2f".format(originalPrice))
        displayDiscount()

        val finalPrice = originalPrice - ((originalPrice * discountPercentage) / 100)
        println("Final Price    : %.2f".format(finalPrice))
    }
}

fun inputProductName(): String
{
    while(true)
    {
        print("\nEnter Product Name : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun inputProductPrice(): Double
{
    while(true)
    {
        print("Enter Product Price : ")
        val inputPrice = readln().trim().toDoubleOrNull()
        if(inputPrice == null || inputPrice <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputPrice
    }
}

fun displayDetails(products: MutableList<Product>)
{
    for(product in products)
    product.displayProductDetails()
}

fun main()
{
    print("How many products do you want to create? : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input <= 0)
    {
        println("Invalid Input!")
        return
    }

    val products = mutableListOf<Product>()
    for(i in 1..input)
    {
        val productName = inputProductName()
        val productPrice = inputProductPrice()
        val product = Product(productName, productPrice)
        products.add(product)
    }

    displayDetails(products)

    print("\nEnter new discount percentage : ")
    val inputDiscountPct = readln().trim().toDoubleOrNull()
    if(inputDiscountPct == null)
    {
        println("Invalid Input! Try Again")
        return
    }

    Product.updateDiscount(inputDiscountPct)

    println("\nAfter discount updated:")
    displayDetails(products)
}