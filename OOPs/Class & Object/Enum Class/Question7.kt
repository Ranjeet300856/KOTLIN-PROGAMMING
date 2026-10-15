// Question 7: Create a Delivery Service Management System using Kotlin's Enum Class.
enum class DeliveryService(val deliveryCharge: Double) {
    STANDARD(50.0) {
        override fun calculateDeliveryTime(): String = "3 - 5 Days"
    },

    EXPRESS(100.0) {
        override fun calculateDeliveryTime(): String = "1 - 2 Days"
    },
    SAME_DAY(200.0) {
        override fun calculateDeliveryTime(): String = "Within 24 Hours"
    };

    abstract fun calculateDeliveryTime(): String
    fun displayDeliveryDetails(orderAmount: Double) {
        println("Delivery Service : ${this.name}")
        println("Delivery Charge  : %.2f".format(deliveryCharge))
        println("Delivery Time    : " + calculateDeliveryTime())
        println("Total Amount     : %.2f\n".format(orderAmount + deliveryCharge))
    }
}

fun main()
{
    for(deliveryService in DeliveryService.entries) {
        deliveryService.displayDeliveryDetails(1000.0)
    }
}