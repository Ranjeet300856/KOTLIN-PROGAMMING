/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch two async coroutines in the same scope that perform different
    calculations and return their results. Use await() to retrieve both
    results and print them. Handle any exception that may occur during
    the calculations using try-catch and demonstrate how an exception
    from an async coroutine is propagated when await() is called.
*/

package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val scope = CoroutineScope(Dispatchers.Default + job)
    val coroutine1 = scope.async {
        val x = 10
        val y = 20
        x + y
    }

    val coroutine2 = scope.async {
        val x = 10
        val y = 0
        x / y
    }

    try {
        println("Coroutine 1 Result : ${coroutine1.await()}")
        println("Coroutine 2 Result : ${coroutine2.await()}")
    } catch(e: ArithmeticException) {
        println(e.message)
    }
}