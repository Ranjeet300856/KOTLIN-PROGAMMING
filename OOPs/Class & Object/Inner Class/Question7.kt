//Question 7 — Inner Class with State & Object Relationship
class OnlineOrder(
    private val orderId: Int,
    private val customerName: String,
    private var totalAmount: Double,
    private var orderStatus: String
) {
    inner class OrderManager {
        fun addAmount(amount: Double) {
            if(amount > 0) {
                if(orderStatus.uppercase() == "ACTIVE") {
                    totalAmount += amount
                    println("Amount added successfully.")
                } else {
                    println("Cannot modify a cancelled order.")
                }
            } else {
                println("Invalid Amount!")
            }
        }

        fun applyDiscount(discountPercent: Double) {
            if(discountPercent in 0.0..100.0) {
                if(orderStatus.uppercase() == "ACTIVE") {
                    totalAmount -= totalAmount * discountPercent / 100
                    println("Discount applied successfully.")
                } else {
                    println("Cannot modify a cancelled order.")
                }
            } else {
                println("Invalid Discount Percent.")
            }
        }

        fun cancelOrder() {
            orderStatus = "CANCELLED"
            println("Order cancelled successfully.")
        }

        fun showOrderDetails() {
            println("Order ID      : $orderId")
            println("Customer Name : $customerName")
            println("Total Amount  : %.2f".format(totalAmount))
            println("Order Status  : $orderStatus\n")
        }
    }
}

fun main()
{
    val onlineOrder = OnlineOrder(1001, "Rahul", 5000.00, "Active")
    val orderManager = onlineOrder.OrderManager()

    orderManager.showOrderDetails()

    orderManager.addAmount(2000.00)
    orderManager.applyDiscount(10.00)
    orderManager.showOrderDetails()

    orderManager.cancelOrder()

    orderManager.addAmount(1000.00)
    orderManager.applyDiscount(10.00)
}