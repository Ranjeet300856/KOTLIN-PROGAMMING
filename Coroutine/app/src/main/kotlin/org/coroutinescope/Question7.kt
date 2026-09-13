//Write a Kotlin program that demonstrates how coroutineScope {} can return a value after all its child coroutines have completed.
package org.coroutineScope
import kotlinx.coroutines.*

suspend fun calculateTotal(): Int
{
    val result = coroutineScope {
        val price = async {
            delay(1000)
            500
        }

        val deliveryCharge = async {
            delay(2000)
            100
        }

        price.await() + deliveryCharge.await()
    }

    return result
}

suspend fun main()
{
    val totalPrice = calculateTotal()
    println("Total Price : $totalPrice")
}