/*
    Question 5 — Nested Class with Business Logic
    Shopping Cart Product System
    Create a Kotlin program using a Nested Class. 
*/

class ShoppingCart {
    class Product(
        val productName: String,
        val productId: Int,
        private val price: Double,
        private val quantity: Int
    ) {
        fun calculateTotalPrice(): Double = price * quantity
        fun isBulkOrder(): Boolean = quantity >= 10

        fun displayProduct() {
            println("Product Name : $productName")
            println("Product ID   : $productId")
            println("Price        : %.2f".format(price))
            println("Quantity     : $quantity")
            println("Total Price  : %.2f".format(calculateTotalPrice()))
            println("Bulk Order   : ${if(isBulkOrder()) "Yes" else "No"}\n")
        }
    }
}

fun main()
{
    val product1 = ShoppingCart.Product("Wireless Mouse", 101, 799.50, 2)
    val product2 = ShoppingCart.Product("Keyboard", 102, 1200.00, 10)
    val product3 = ShoppingCart.Product("Monitor", 103, 8500.75, 15)

    product1.displayProduct()
    product2.displayProduct()
    product3.displayProduct()
}