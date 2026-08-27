/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch two coroutines in the same scope that perform a repeated task
    using a loop. After a few seconds, cancel the parent Job and observe
    how cancellation affects both child coroutines. Print appropriate
    messages before and after cancellation to demonstrate the behavior.
*/

package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val scope = CoroutineScope(Dispatchers.Default + job)
    val coroutine1 = scope.launch {
        println("Coroutine 1:")
        for(i in 1..20) {
            delay(2000)
            println(i)
        }
    }

    val coroutine2 = scope.launch {
        println("\nCoroutine 2:")
        for(i in 1..20) {
            delay(2000)
            println(i)
        }
    }

    println("\nBefore Parent Cancellation")
    delay(5000)
    job.cancel()
    println("\nAfter Cancellation")
    coroutine1.join()
    coroutine2.join()
    println("Program Completed")
}