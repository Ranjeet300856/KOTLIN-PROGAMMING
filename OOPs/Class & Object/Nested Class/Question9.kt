//Question 9 — Nested Class with Multiple Nested Components
class Order {
    class Customer(
        val name: String,
        private val email: String
    ) {
        fun displayCustomer() {
            println("Customer Name  : $name")
            println("Customer Email : $email")
        }
    }

    class Product(
        val productName: String,
        private val price: Double,
        val quantity: Int
    ) {
        fun calculateTotalPrice(): Double = price * quantity
        fun displayProduct() {
            println("Product Name  : $productName")
            println("Product Price : %.2f".format(price))
            println("Quantity      : $quantity")
        }
    }

    class Summary {
        fun generateSummary(customer: Customer, product: Product) {
            customer.displayCustomer()
            product.displayProduct()
            
            val totalPrice = product.calculateTotalPrice()
            println("Total Price : $totalPrice\n")
        }
    }
}

fun main()
{
    val customer = Order.Customer("Rahul", "rahul@gmail.com")
    val product1 = Order.Product("Keyboard", 1000.0, 2)
    val product2 = Order.Product("Mouse", 200.0, 2)
    val product3 = Order.Product("Laptop", 60000.0, 1)

    val summary = Order.Summary()
    summary.generateSummary(customer, product1)
    summary.generateSummary(customer, product2)
    summary.generateSummary(customer, product3)
}