/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch a coroutine that performs a task which can throw an exception.
    Handle the exception inside the coroutine using try-catch and use a
    CoroutineExceptionHandler in the scope. Print appropriate messages
    to demonstrate the difference between handling an exception with
    try-catch inside the coroutine and handling an uncaught exception
    with CoroutineExceptionHandler.
*/
package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val handler = CoroutineExceptionHandler { _, exception -> println(exception.message)}
    val scope = CoroutineScope(Dispatchers.Default + job + handler)
    val coroutine = scope.launch {
        val x = 50
        val y = 0
        try {
            println(x / y)
        } catch(e: ArithmeticException) {
            println(e.message)
        }
    }

    val coroutine2 = scope.launch {
        val x = 10
        val y = 0
        if(y > 0) println(x / y)
        else throw ArithmeticException("Divide by zero not allowed")
    }

    coroutine.join()
    coroutine2.join()
}