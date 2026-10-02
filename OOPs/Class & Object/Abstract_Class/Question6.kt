//Question 6 — Abstract Class with Template Method
abstract class Payment {
    fun processPayment() {
        validatePayment()
        makePayment()
        showSuccessMessage()
    }

    fun validatePayment() {
        println("Payment validated")
    }

    fun showSuccessMessage() {
        println("Payment successful")
    }

    abstract fun makePayment()
}

class UPIPayment : Payment() {
    override fun makePayment() {
        println("Payment made through UPI")
    }
}

class CardPayment : Payment() {
    override fun makePayment() {
        println("Payment made through Card")
    }
}

fun main()
{
    val upiPayment = UPIPayment()
    val cardPayment = CardPayment()

    upiPayment.processPayment()
    println()
    cardPayment.processPayment()
}