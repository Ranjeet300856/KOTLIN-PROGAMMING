//Question 9: Interface-Based Payment System
interface PaymentProcessor {
    fun processPayment(amount: Double): Boolean
    fun printReceipt(amount: Double) {
        println("Receipt Generated for : %.2f".format(amount))
    }
}

class UpiPaymentProcessor : PaymentProcessor {
    override fun processPayment(amount: Double): Boolean {
        if(amount > 0) {
            println("Processing UPI Payment %.2f".format(amount))
            return true
        } else {
            println("Invalid payment amount")
            return false
        }
    }
}

class CardPaymentProcessor : PaymentProcessor {
    override fun processPayment(amount: Double): Boolean{
        if(amount > 0) {
            println("Processing Card Payment : %.2f".format(amount))
            return true
        } else {
            println("Invalid payment amount")
            return false
        }
    }

    override fun printReceipt(amount: Double) {
        println("Card receipt generated for : %.2f".format(amount))
    }
}

class CheckoutService(val paymentProcessor: PaymentProcessor) {
    fun checkout(amount: Double) {
        if(paymentProcessor.processPayment(amount)) {
            paymentProcessor.printReceipt(amount)
        } else {
            println("Payment failed. Please try again.")
        }
    }
}

class MockPaymentProcess : PaymentProcessor { 
    override fun processPayment(amount: Double): Boolean {
        println("Mock payment successful : %.2f".format(amount))
        return true
    }
}

fun main()
{
    val upiPayment = UpiPaymentProcessor()
    val cardPayment = CardPaymentProcessor()

    val checkoutService1 = CheckoutService(upiPayment)
    val checkoutService2 = CheckoutService(cardPayment)

    checkoutService1.checkout(500.0)
    checkoutService2.checkout(1200.0)
    println()
    checkoutService1.checkout(0.0)
    checkoutService2.checkout(-100.0)

    println()
    val mockPayment = MockPaymentProcess()
    val checkoutService3 = CheckoutService(mockPayment)
    checkoutService3.checkout(250.0)
}