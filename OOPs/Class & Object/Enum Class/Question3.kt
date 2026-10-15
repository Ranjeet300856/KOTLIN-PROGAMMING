/*
    Create a payment processing system using Kotlin's Enum Class. 
    Each payment method must have a predefined transaction fee percentage, 
    and the system must calculate the final payment amount based on the selected payment method. 
*/

enum class PaymentMethod(private val feePercentage: Double) {
    UPI(0.0),
    DEBIT_CARD(1.0),
    CREDIT_CARD(2.0),
    NET_BANKING(0.5);

    private fun calculateFee(amount: Double): Double {
        return amount * feePercentage / 100
    }

    private fun calculateFinalAmount(amount: Double): Double {
        return amount + calculateFee(amount)
    }

    fun displayPaymentDetails(amount: Double) {
        println("Payment Method : ${this.name}")
        println("Fee Percentage : %.2f%%".format(feePercentage))
        println("Original Amount : %.2f".format(amount))
        println("Transaction Fee : %.2f".format(calculateFee(amount)))
        println("Final Amount    : %.2f\n".format(calculateFinalAmount(amount)))
    }
}

fun main()
{
    for(method in PaymentMethod.entries) {
        method.displayPaymentDetails(1500.00)
    }
}