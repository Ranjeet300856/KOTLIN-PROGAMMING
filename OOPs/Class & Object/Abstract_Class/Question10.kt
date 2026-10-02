//Question 10 — Advanced Abstract Class: Real-World E-Commerce Order System
abstract class Order(
    val orderId: String,
    val customerName: String,
    val amount: Double
) {
    fun displayOrderInfo() {
        println("Order ID     : $orderId")
        println("Customer Name: $customerName")
        println("Amount       : %.2f".format(amount))
    }

    fun processOrder() {
        if(validateOrder()) {
            displayOrderInfo()
            val finalAmount = calculateFinalAmount()
            println("Final Amount : %.2f".format(finalAmount))
            processPayment()
            showConfirmation()
        }
    }

    abstract fun calculateFinalAmount(): Double
    abstract fun processPayment()

    fun validateOrder(): Boolean {
        if(orderId.isBlank() || customerName.isBlank() || amount <= 0) {
            println("Invalid Order")
            return false
        } else {
            println("Order validated")
            return true
        }
    }

    fun showConfirmation() {
        println("Order confirmed")
    }
}

class OnlineOrder(
    val deliveryCharge: Double,
    orderId: String,
    customerName: String,
    amount: Double
) : Order(orderId, customerName, amount) {
    override fun calculateFinalAmount(): Double {
        return amount + deliveryCharge
    }

    override fun processPayment() {
        super.displayOrderInfo()
        println("Online payment processed")
    }
}

class StoreOrder(
    val discount: Double,
    orderId: String,
    customerName: String,
    amount: Double
) : Order(orderId, customerName, amount) {
    override fun calculateFinalAmount(): Double {
        if(discount > 0 && discount <= amount) {
            return amount - discount
        } else {
            println("Invalid Discount")
            return amount
        }
    }

    override fun processPayment() {
        println("Store payment processed")
    }
}

fun main() 
{
    val onlineOrder = OnlineOrder(2000.0, "ORD101", "Ranjeet", 50000.0)
    val storeOrder = StoreOrder(5000.0, "ORD102", "Rahul", 30000.0)

    val orders = listOf(onlineOrder, storeOrder)
    
    for(order in orders) {
        order.processOrder()
        println()
    }
}