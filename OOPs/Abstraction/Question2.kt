//Create a Kotlin program using Abstraction to implement a simple Payment Processing System.
abstract class Payment {
    abstract fun processPayment(amount: Double): Boolean
}

class UPIPayment : Payment() {
    override fun processPayment(amount: Double): Boolean {
        if(amount <= 0 || !amount.isFinite()) return false
        else {
            println("UPI Payment Successful : %.2f".format(amount))
            return true
        }
    }
}

class CardPayment : Payment() {
    override fun processPayment(amount: Double): Boolean {
        if(amount <= 0 || !amount.isFinite()) return false
        else {
            println("Card Payment Successful : %.2f".format(amount))
            return true
        }
    }
}

fun main()
{
    val upiPayment = UPIPayment()
    val cardPayment = CardPayment()

    val result1 = upiPayment.processPayment(500.0)
    val result2 = cardPayment.processPayment(1000.0)
    val result3 = upiPayment.processPayment(-500.0)

    if(!result1) println("Invalid Payment Amount")
    if(!result2) println("Invalid Payment Amount")
    if(!result3) println("Invalid Payment Amount")
}