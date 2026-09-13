//Write a Kotlin program using coroutineScope {} to demonstrate exception propagation from a child coroutine to its parent scope.
package org.coroutineScope
import kotlinx.coroutines.*

suspend fun performTasks2()
{
    coroutineScope {
        val coroutine1 = launch {
            delay(1000)
            println("Coroutine 1 Completed")
        }

        val coroutine2 = launch {
            delay(2000)
            throw Exception("Error in Coroutine 2")
        }

        val coroutine3 = launch {
            try {
                for(i in 1..10)
                {
                    delay(1000)
                    println("Coroutine 3 Working...$i")
                }
            } finally {
                println("Task 3 Cancelled")
            }
        }
    }
}

suspend fun main()
{
    try {
        performTasks2()
    } catch(e: Exception) {
        println(e.message)
        println("Parent handled the exception")
    }
}