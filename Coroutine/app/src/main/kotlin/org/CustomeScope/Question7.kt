/*
    Question:
    Create a custom CoroutineScope using a Job, Dispatchers.Default,
    CoroutineName, and CoroutineExceptionHandler. Launch two coroutines
    in the same scope, give each coroutine its own CoroutineName, and
    print their names and dispatcher information. Make one coroutine
    throw an exception and handle it using the CoroutineExceptionHandler.
    Ensure that the other coroutine performs a repeated task and observe
    how the exception affects it when both coroutines share the same Job.
*/

package org.CustomScope
import kotlinx.coroutines.*
import kotlin.coroutines.ContinuationInterceptor
suspend fun main()
{
    val job = Job()
    val coroutineName = CoroutineName("My Coroutine")
    val handler = CoroutineExceptionHandler {
        _, exception -> println(exception.message)
    }

    val context = Dispatchers.Default + job + coroutineName + handler
    val scope = CoroutineScope(context)

    val coroutine1 = scope.launch(CoroutineName("1st Coroutine")) {
        println("Coroutine 1 Name : ${coroutineContext[CoroutineName]?.name}")
        println("Coroutine 1 Dispatcher : ${coroutineContext[ContinuationInterceptor]}")

        for(i in 1..10)
        {
            delay(1000)
            print("$i ")
        }
    }

    val coroutine2 = scope.launch(CoroutineName("2nd Coroutine")) {
        println("Coroutine 2 Name : ${coroutineContext[CoroutineName]?.name}")
        println("Coroutine 1 Dispatcher : ${coroutineContext[ContinuationInterceptor]}")

        val x = 10
        val y = 0
        if(y > 0) println(x / y)
        else throw ArithmeticException("Divide by zero not allowed")
    }

    coroutine1.join()
    coroutine2.join()
}