//Create an Order Status Tracking System using Kotlin's Enum Class.
enum class OrderStatus(val description: String) {
    PLACED("Order has been placed"),
    CONFIRMED("Order has been confirmed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELLED("Order has been cancelled");

    fun displayStatus() {
        println("Order Status : ${this.name}")
        println("Description  : $description")
        println("Can Cancel   : ${if(canBeCancelled()) "Yes" else "No"}\n")
    }

    fun canBeCancelled(): Boolean = this == PLACED || this == CONFIRMED
}

fun main()
{
    for(order in OrderStatus.entries) {
        order.displayStatus()
    }
}