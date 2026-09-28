/*
    Question 4 — Sealed Class with Common Properties and Functions

    Task:
    Create a Kotlin program using a sealed class named PaymentResult to represent the result of a payment operation.

    The application can have these states:

    Success — payment completed successfully and contains the transaction ID.
    Failed — payment failed and contains an error message.
    Processing — payment is currently being processed.
*/

sealed class PaymentResult(val timeSpant: String) {
    fun showTimeSpant() {
        println("Time Spant : $timeSpant")
    }
}

class Success(val transactionId: String, timeSpant: String) : PaymentResult(timeSpant) {
    fun showTranscationId() {
        println("Transaction ID : $transactionId")
    }
}

class Failed(val errorMessage: String, timeSpant: String) : PaymentResult(timeSpant) {
    fun showErrorMessage() {
        println(errorMessage)
    }
}

class Processing(timeSpant: String) : PaymentResult(timeSpant)

fun showData(message: String, paymentResult: PaymentResult) {
    println("\n$message")
    when(paymentResult) {
        is Success -> {
            paymentResult.showTranscationId()
            paymentResult.showTimeSpant()
        }

        is Failed -> {
            paymentResult.showErrorMessage()
            paymentResult.showTimeSpant()
        }

        is Processing -> {
            paymentResult.showTimeSpant()
        }
    }
}

fun main()
{
    val success = Success("TXN12345", "10:30 AM")
    val failed = Failed("Error: Insufficient balance", "Timestamp: 10:31 AM")
    val processing = Processing("Timestamp: 10:32 AM")

    showData("Payment Successful", success)
    showData("Payment Failed", failed)
    showData("Payment Processing", processing)
}