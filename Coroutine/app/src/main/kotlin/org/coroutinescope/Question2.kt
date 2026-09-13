/*
    Write a Kotlin program using coroutineScope {} to demonstrate Coroutine Context inheritance.

    Start a parent coroutine using launch with Dispatchers.Default.
    Give the parent coroutine a CoroutineName of "ParentCoroutine".
    Inside the parent coroutine, create a coroutineScope {}.
    Inside coroutineScope {}, start two child coroutines using launch.
    The child coroutines should inherit the parent's dispatcher and coroutine name.
    Each child should print its coroutine name and the thread name on which it is running.
    After both children complete, print "All child coroutines completed" from inside the parent coroutine. 
*/

package org.coroutineScope
import kotlinx.coroutines.*
import kotlin.coroutines.ContinuationInterceptor
suspend fun main()
{
    coroutineScope {
        launch(Dispatchers.Default + CoroutineName("ParentCoroutine")) {
            println("Parent Coroutine Name      : ${coroutineContext[CoroutineName]?.name}")
            println("Parent Coroutine Thread    : ${coroutineContext[ContinuationInterceptor]}")
        coroutineScope {
            launch {
                println("Child Coroutine 1 Name   : ${coroutineContext[CoroutineName]?.name}")
                println("Child Coroutine 1 Thread : ${coroutineContext[ContinuationInterceptor]}")
            }

            launch {
                println("ChildCoroutine 2 Name   : ${coroutineContext[CoroutineName]?.name}")
                println("ChildCoroutine 2 Thread : ${coroutineContext[ContinuationInterceptor]}")
            }
        }

        println("All child coroutines completed")
    }
}
}