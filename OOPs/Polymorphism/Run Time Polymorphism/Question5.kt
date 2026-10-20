//Question 5: Payment Processing System
abstract class Payment(val amount: Double) {
    abstract fun calculateFee(): Double
    open fun processPayment(): Boolean {
        if(amount > 0) {
            val paymentFee = calculateFee()
            println("Payment Amount : %.2f".format(amount))
            println("Processing Fee : %.2f".format(paymentFee))
            println("Total Amount   : %.2f".format(amount + paymentFee))
            return true
        } else {
            println("Invalid Payment Amount")
            return false
        }
    }
}

class CreditCardPayment(amount: Double) : Payment(amount) {
    override fun calculateFee(): Double = amount * 2 / 100
    override fun processPayment(): Boolean {
        return super.processPayment()
    }
}

class UPIPayment(amount: Double) : Payment(amount) {
    override fun calculateFee(): Double = amount * 0 / 100
}

class BankTransferPayment(amount: Double) : Payment(amount) {
    override fun calculateFee(): Double = amount * 1 / 100
}

fun main()
{
    val creditCardPayment1 = CreditCardPayment(1000.0)
    val upiPayment = UPIPayment(1000.0)
    val bankTransferPayment = BankTransferPayment(1000.0)
    val creditCardPayment2 = CreditCardPayment(-500.0)

    val payments = listOf(creditCardPayment1, upiPayment, bankTransferPayment, creditCardPayment2)
    for(payment in payments) {
        val result = payment.processPayment()
        if(result) println("Payment Successfull\n")
        else println("Payment Unsuccessfull\n")
    }
}