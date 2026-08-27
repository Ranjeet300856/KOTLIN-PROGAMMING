/*
    Question:
    Create a custom CoroutineScope using a Job, Dispatchers.Default,
    CoroutineName, and CoroutineExceptionHandler. Launch three child
    coroutines in the same scope. The first coroutine should perform a
    repeated task, the second coroutine should perform a calculation
    and return its result using async, and the third coroutine should
    throw an exception. Handle the exception appropriately, cancel the
    custom scope after the required tasks are completed or when the
    failure occurs, and ensure all child coroutines finish before the
    program ends. Print meaningful messages to demonstrate the custom
    scope, coroutine context, async/await, exception handling,
    cancellation, and structured concurrency.
*/

package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val coroutineName = CoroutineName("Parent Coroutine")
    val dispatcher = Dispatchers.Default
    val handler = CoroutineExceptionHandler {
        _, exception ->
        println(exception.message)
    }

    val context = job + coroutineName + dispatcher + handler
    val scope = CoroutineScope(context)
    
    val coroutine1 = scope.launch {
        println("Coroutine 1:")
        for(i in 1..10)
        {
            println("$i")
            delay(1000)
        }
    }

    val coroutine2 = scope.async {
        println("Coroutine 2:")
        val x = 10
        val y = 20
        x + y
    }

    val coroutine3 = scope.launch {
        delay(2000)
        println("Coroutine 3:")
        val x = 10
        val y = 0
        if(y > 0) println("Division of $x / $y : ${x / y}")
        else throw ArithmeticException("Divide by zero not allowed")
    }

    println("Coroutine 2 Result : ${coroutine2.await()}")

    coroutine1.join()
    coroutine2.join()
    coroutine3.join()
}