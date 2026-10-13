/*
    Create an interface named PaymentMethod with the following functions:

    An abstract function pay(amount: Double) that must be implemented by every implementing class.
    A function showTransactionStatus() with a default implementation that prints "Transaction processing...".

    Create two classes, UPIPayment and CardPayment, that implement the PaymentMethod interface. 
*/

interface PaymentMethod {
    fun pay(amount: Double)
    fun showTransactionStatus() {
        println("Transaction Processing...")
    }
}

class UPIPayment : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paid ${"%.2f".format(amount)} using UPI")
    } 
}

class CardPayment : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paid ${"%.2f".format(amount)} using Card")
    }

    override fun showTransactionStatus() {
        println("Card transaction completed successfully")
    }
}

fun main()
{
    val upiPayment: PaymentMethod = UPIPayment()
    val cardPayment: PaymentMethod = CardPayment()

    upiPayment.pay(500.0)
    upiPayment.showTransactionStatus()

    cardPayment.pay(800.0)
    cardPayment.showTransactionStatus()
}