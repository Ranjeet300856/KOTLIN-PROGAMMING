//Write a Kotlin program using coroutineScope {} to simulate a real-world order processing system.
package org.coroutineScope
import kotlinx.coroutines.*

suspend fun processOrder2()
{
    coroutineScope {
        launch(Dispatchers.Default + CoroutineName("OrderProcessor")) {
            coroutineScope {
                val validateOrder = async {
                println("${coroutineContext[CoroutineName]?.name} | ${Thread.currentThread().name}")
                delay(800)
                "Order Validated"
            }

            val fatchProductInfo = async {
                println("${coroutineContext[CoroutineName]?.name} | ${Thread.currentThread().name}")
                delay(1200)
                "Product Details Fetched"
            }

            println("${validateOrder.await()}")
            println("${fatchProductInfo.await()}")

            launch {
                try {
                    for(i in 1..5) {
                        delay(400)
                        println("${coroutineContext[CoroutineName]?.name} | ${Thread.currentThread().name}")
                        println("Payment processing...$i")
                    }
                } finally {
                    println("Payment processing cancelled")
                }
            }

            launch {
                println("${coroutineContext[CoroutineName]?.name} | ${Thread.currentThread().name}")
                delay(1500)
                throw Exception("Payment processing failed")
            }
        }
        }
    }
}

suspend fun main()
{
    try {
        println("===== Order Processing =====")
        processOrder2()
    } catch(e: Exception) {
        println(e.message)
        println("Order processing failed")
    }
}