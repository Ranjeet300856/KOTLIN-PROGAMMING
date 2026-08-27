/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch two long-running coroutines in the scope that repeatedly
    perform tasks. After a few seconds, cancel the entire custom scope
    using its parent Job. Ensure that both child coroutines stop their
    execution because the scope is cancelled, and print appropriate
    messages before and after cancelling the scope to demonstrate
    proper coroutine lifecycle management.
*/

package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val scope = CoroutineScope(Dispatchers.Default + job)
    val coroutine1 = scope.launch {
        for(i in 1..10)
        {
            println(i)
            delay(1000)
        }
    }

    val coroutine2 = scope.launch {
        for(i in 1..10)
        {
            println(i)
            delay(1000)
        }
    }

    println("Before Cancelling")
    delay(3000)
    job.cancel()
    println("After Cancelling")
    println("Parent Job cancelled")

    coroutine1.join()
    coroutine2.join()
}