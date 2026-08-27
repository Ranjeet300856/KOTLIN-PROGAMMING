/*
    Question:
    Create a custom CoroutineScope using a Job, Dispatchers.Default,
    and a CoroutineName. Launch two coroutines in this scope and print
    each coroutine's name along with its progress messages. Ensure that
    both coroutines use the same custom scope and demonstrate that the
    CoroutineName is part of their coroutine context.
*/

package org.CustomScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val coroutineName = CoroutineName("MyCoroutine")
    val scope = CoroutineScope(Dispatchers.Default + job + coroutineName)
    val coroutine1 = scope.launch(CoroutineName("1st Coroutine")) {
        for(i in 1..5) {
            println("${coroutineContext[CoroutineName]} Step $i")
        }
    }

    val coroutine2 = scope.launch(CoroutineName("2nd Coroutine")) {
        for(i in 1..5) {
            println("${coroutineContext[CoroutineName]} Step $i")
        }
    }

    coroutine1.join()
    coroutine2.join()
}