//Write a Kotlin program using nested coroutineScope {} blocks to demonstrate how child coroutines are organized in a hierarchy.
package org.coroutineScope
import kotlinx.coroutines.*

suspend fun validateOrder()
{
    coroutineScope {
        launch {
            delay(1000)
            println("Validate user information")
        }

        launch {
            delay(2000)
            println("Validate product information.")
        }
    }

    println("Order validation completed")
}

suspend fun processPayment()
{
    coroutineScope {
        launch {
            delay(1500)
            println("Process payment.")
        }

        launch {
            delay(2000)
            println("Generate payment receipt.")
        }
    }

    println("Payment processing completed")
}

suspend fun processOrder()
{
    coroutineScope {
        launch {
            validateOrder()
        }

        launch {
            processPayment()
        }
    }

    println("Order processing completed")
}

suspend fun main()
{
    processOrder()
}