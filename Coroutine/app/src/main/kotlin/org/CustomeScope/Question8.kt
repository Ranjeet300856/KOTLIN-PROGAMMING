/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch two child coroutines from the same scope where the first
    coroutine performs a short task and the second coroutine performs
    a longer task. Ensure that the main function waits for the required
    child coroutines to complete before printing the final completion
    message. Demonstrate the parent-child relationship and structured
    execution of coroutines using Job references.
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
            delay(1000)
            println(i)
        }
    }

    val coroutine2 = scope.launch {
        for(i in 1..10)
        {
            delay(2000)
            println(i)
        }
    }

    coroutine1.join()
    coroutine2.join()

    println("Program Completed")
}