/*
    Write a Kotlin program to process a payment using an Object Expression that implements a PaymentMethod interface.
    The PaymentMethod interface must contain:
    A function processPayment(amount: Double) that processes a payment.
    A function getPaymentMethodName(): String that returns the payment method's name.

    Create an anonymous object that implements this interface. 
*/

interface PaymentMethod {
    fun processPayment(amount: Double)
    fun getPaymentMethodName(): String
}

fun main()
{
    val payment = object : PaymentMethod {
        override fun processPayment(amount: Double) {
            if(amount <= 0) println("Payment Failed: Amount must be greater than zero.")
            else println("Payment Successful : %.2f".format(amount))
        }

        override fun getPaymentMethodName(): String = "UPI"
    }

    println("Payment Method Name : ${payment.getPaymentMethodName()}")
    payment.processPayment(15000.0)
    payment.processPayment(0.0)
    payment.processPayment(-500.0)
}