/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch two coroutines in the same scope. Make the first coroutine
    perform a task that throws an exception, while the second coroutine
    continues performing its task. Handle the exception using a
    CoroutineExceptionHandler and print appropriate messages to
    demonstrate what happens when an exception occurs in a child
    coroutine of the custom scope.
*/

package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val handler = CoroutineExceptionHandler{_, exception ->
        println(exception.message)
    }
    val job = Job()
    val scope = CoroutineScope(Dispatchers.Default + job + handler)

    val coroutine1 = scope.launch {
        val arr = arrayOf(10, 20, 30, 40, 50)
        val index = 10
        if(index < arr.size) println(arr[index])
        else throw IndexOutOfBoundsException("Array index not valid")
    }

    val coroutine2 = scope.launch {
        for(i in 1..20)
        {
            if(i % 2 == 0) delay(1000)
            print("$i ")
        }
    }

    coroutine1.join()
    coroutine2.join()
}