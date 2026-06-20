/*
    Question 10: Smart Payment Processing System Using Complete Inline Lambda Management
    Problem Statement:
    Create a Kotlin program to develop a Smart Payment Processing System using Normal Inline Lambda, noinline Lambda, and crossinline Lambda.

    Scenario: 
    A payment application performs multiple operations during a payment transaction:
    - It starts the payment process.
    - It saves payment history for records.
    - It performs security verification.
    - It completes the payment process.
*/

fun savePaymentHistory(histroyAction: () -> Unit)
{
    println("History Saved")
    histroyAction()
}

inline fun processPayment(startPayment: () -> Unit, noinline saveHistory: () -> Unit, crossinline securityCheck: () -> Unit)
{
    startPayment()
    savePaymentHistory(saveHistory)
    securityCheck()
    println("Payment Process Completed Successfully")
}

fun makePayment()
{
    processPayment(
        { println("Payment started") },
        { println("History Saved Successfully") }
    ) {
        println("Verifying OTP")
        println("Checking fraud protection")
    }
}

fun main()
{
    makePayment()
}