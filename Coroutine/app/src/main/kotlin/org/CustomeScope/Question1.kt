/*
    Question:
    Create a custom CoroutineScope using a Job and Dispatchers.Default.
    Launch two coroutines inside this scope that perform different tasks
    and print their progress messages. Ensure that both coroutines are
    executed within the same custom scope.
*/

package org.CustomScope
import kotlinx.coroutines.*
fun main() {
    val job = Job()
    val scope = CoroutineScope(Dispatchers.Default + job)

    val coroutine1 = scope.launch {
        for (i in 1..5) {
            println("Coroutine 1: Processing item $i")
        }
    }

    val coroutine2 = scope.launch {
        for (i in 1..5) {
            println("Coroutine 2: Processing item $i")
        }
    }

    runBlocking {
        coroutine1.join()
        coroutine2.join()
    }
}